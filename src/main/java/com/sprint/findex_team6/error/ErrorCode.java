package com.sprint.findex_team6.error;


import lombok.Getter;

@Getter
public enum ErrorCode {

  // index info
  INDEX_NOT_FOUND(404, "지수 정보를 찾지 못했습니다."),
  INDEX_INFO_DUPLICATE_EXCEPTION(400, "지수 정보가 중복입니다."),

  // indexVal
  INDEX_VAL_INTEGRITY_VIOLATION(400, "중복된 지수 및 날짜 조합입니다."),
  INDEX_BAD_REQUEST(400,"잘못된 요청입니다."),
  INDEX_VAL_NOT_FOUND(404,"해당 ID의 지수 정보를 찾을 수 없습니다."),
  INDEX_INTERNAL_SERVER_ERROR(500,"서버 내부 오류가 발생했습니다.");


  private final int status;
  private final String message;

  ErrorCode(int status, String message) {
    this.status = status;
    this.message = message;
  }

}
