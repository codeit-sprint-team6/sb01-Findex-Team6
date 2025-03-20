package com.sprint.findex_team6.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "index_val", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"date", "index_id"})
})
public class IndexVal {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "date")
  private LocalDate baseDate;         // 기준 일자

  @Enumerated(EnumType.STRING)
  @Column(name = "source_type", columnDefinition = "source_type")
  @JdbcTypeCode(SqlTypes.NAMED_ENUM)
  private SourceType sourceType;      // 소스 타입

  @Column(name = "market_price")
  private BigDecimal marketPrice; // 시가

  @Column(name = "close_price")
  private BigDecimal closingPrice; // 종가

  @Column(name = "high_price")
  private BigDecimal highPrice; // 고가

  @Column(name = "low_price")
  private BigDecimal lowPrice;  // 저가

  @Column(name = "versus")
  private BigDecimal versus;       // 대비

  @Column(name = "fluctuation_rate")
  private BigDecimal fluctuationRate; // 등락률

  @Column(name = "trading_quantity")
  private Long tradingQuantity;             // 거래량

  @Column(name = "trading_price")
  private BigDecimal tradingPrice; // 거래대금

  @Column(name = "market_total_count")
  private BigDecimal marketTotalCount;    // 상장 시가 총액

  @ManyToOne //하나의 지수정보에 대해 여러개의 지수 데이터
  @JoinColumn(name = "index_id")
  private Index index;

  @Builder
  public IndexVal(
      LocalDate baseDate,
      SourceType sourceType,
      BigDecimal marketPrice,
      BigDecimal closingPrice,
      BigDecimal highPrice,
      BigDecimal lowPrice,
      BigDecimal versus,
      BigDecimal fluctuationRate,
      Long tradingQuantity,
      BigDecimal tradingPrice,
      BigDecimal marketTotalCount,
      Index index
  ) {
    this.baseDate = baseDate;
    this.sourceType = sourceType;
    this.marketPrice = marketPrice;
    this.closingPrice = closingPrice;
    this.highPrice = highPrice;
    this.lowPrice = lowPrice;
    this.versus = versus;
    this.fluctuationRate = fluctuationRate;
    this.tradingQuantity = tradingQuantity;
    this.tradingPrice = tradingPrice;
    this.marketTotalCount = marketTotalCount;
    this.index = index;
  }

}
