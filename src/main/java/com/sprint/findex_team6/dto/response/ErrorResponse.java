package com.sprint.findex_team6.dto.response;

import java.time.LocalDateTime;

public record ErrorResponse(
    LocalDateTime timestamp,
    Integer status,
    String message,
    String details
) {

}
