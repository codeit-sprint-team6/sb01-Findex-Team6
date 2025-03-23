package com.sprint.findex_team6.service;

import com.sprint.findex_team6.dto.AutoSyncConfigDto;
import com.sprint.findex_team6.dto.request.AutoSyncConfigCursorPageRequest;
import com.sprint.findex_team6.dto.request.AutoSyncConfigUpdateRequest;
import com.sprint.findex_team6.dto.response.CursorPageResponseSyncDto;
import com.sprint.findex_team6.entity.AutoIntegration;
import com.sprint.findex_team6.exception.syncjobs.NotFoundIndexException;
import com.sprint.findex_team6.repository.AutoIntegrationRepository;
import com.sprint.findex_team6.repository.IndexRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class AutoSyncConfigService {

  private final AutoIntegrationRepository autoIntegrationRepository;
  private final IndexRepository indexRepository;

  /**
  * @methodName : modify
  * @date : 2025-03-20 오전 11:19
  * @author : wongil
  * @Description: 자동 연동 설정 수정
  **/
  public AutoSyncConfigDto modify(AutoSyncConfigUpdateRequest request, Long id) {

    AutoIntegration autoIntegration = autoIntegrationRepository.findById(id)
        .orElseThrow(NotFoundIndexException::new);

    autoIntegration.changeEnable(request.enabled());

    return AutoSyncConfigDto.builder()
        .id(autoIntegration.getId())
        .indexInfoId(autoIntegration.getIndex().getId())
        .indexClassification(autoIntegration.getIndex().getIndexClassification())
        .indexName(autoIntegration.getIndex().getIndexName())
        .enabled(request.enabled())
        .build();
  }


  /**
  * @methodName : search
  * @date : 2025-03-20 오전 11:19
  * @author : wongil
  * @Description: 자동 연동 설정 목록 조회
  **/
  public CursorPageResponseSyncDto<AutoSyncConfigDto> search(
      AutoSyncConfigCursorPageRequest request, Pageable slice) {

    checkInvalidValue(request);

    Slice<AutoSyncConfigDto> pagedData = autoIntegrationRepository.cursorBasePagination(
        request, slice);

    List<AutoSyncConfigDto> content = pagedData.getContent();

    int size = request.size() == null ? 10 : request.size();

    long totalElements = autoIntegrationRepository.count();
    boolean hasNext = pagedData.hasNext();

    Long nextIdAfter = null;
    String nextCursor = null;
    Boolean enableBaseNextCursor = null;
    if (hasNext && !content.isEmpty()) {
      AutoSyncConfigDto lastContent = content.get(size - 1);
      nextIdAfter = lastContent.getId();

      if (request.sortField() != null) {
        if (request.sortField().equals("enable")) {
          enableBaseNextCursor = Boolean.valueOf(request.cursor());
        }
        else {
          nextCursor = request.cursor();
        }
      }
    }

    return new CursorPageResponseSyncDto<>(
        content,
        getNextCursor(nextCursor, enableBaseNextCursor),
        nextIdAfter,
        size,
        totalElements,
        hasNext
    );
  }

  private void checkInvalidValue(AutoSyncConfigCursorPageRequest request) {
    indexRepository.findById(request.indexInfoId())
        .orElseThrow(NotFoundIndexException::new);
  }

  private String getNextCursor(String nextCursor, Boolean enableBaseNextCursor) {
    return nextCursor != null ? nextCursor : String.valueOf(enableBaseNextCursor);
  }
}
