package com.sprint.findex_team6.dto.dashboard;

import java.math.BigDecimal;

public record IndexPerformanceDto (
    Long indexInfoId,
    String indexClassification,
    String indexName,
    BigDecimal versus,
    BigDecimal fluctuationRate,
    BigDecimal currentPrice,
    BigDecimal beforePrice
){

}
