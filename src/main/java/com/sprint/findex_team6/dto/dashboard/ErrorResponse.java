package com.sprint.findex_team6.dto.dashboard;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;

@Schema(description = "에러 응답")
public record ErrorResponse(
    @Schema(description = "에러 발생 시간", example = "2025-03-06T05:39:06.152068Z")
    LocalDateTime timestamp,

    @Schema(description = "HTTP 상태 코드" , example = "400")
    int status,

    @Schema(description = "에러 메시지", example = "잘못된 요청입니다.")
    String message,

    @Schema(description = "에러 상세 내용", example = "부서 코드는 필수입니다.")
    String details
) {
  public ErrorResponse(int status, String message, String details) {
    this(LocalDateTime.now(), status, message, details);
  }
}
