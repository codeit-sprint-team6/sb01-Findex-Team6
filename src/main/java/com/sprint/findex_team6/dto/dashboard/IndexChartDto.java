package com.sprint.findex_team6.dto.dashboard;

import java.util.List;
public record IndexChartDto(
    Long indexInfoId,
    String indexClassification,
    String indexName,
    String periodType,
    List<ChartDataPoint> dataPoints,
    List<ChartDataPoint> ma5DataPoints,
    List<ChartDataPoint> ma20DataPoints

) {

}