package com.sprint.findex_team6.repository;

import com.sprint.findex_team6.entity.Index;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IndexRepository extends JpaRepository<Index, Long> {
  
  Optional<Index> findByIndexName(String indexName);
  
  List<Index> findByIndexClassificationContaining(String indexClassification);

  List<Index> findByIndexNameContaining(String indexName);

  List<Index> findByFavorite(boolean favorite);

  boolean existsByIndexClassificationAndIndexName(String classification, String indexName);

  void deleteById(Long indexId);

  Optional<Index> findByIndexClassificationAndIndexName(String classification, String indexName);

  List<Index> findByIndexClassification(String classification); 

  List<Index> findAllByIdIn(Collection<Integer> ids);

  Optional<Index> findById(Long id);

  Page<Index> findAll(Pageable pageable);

  List<Index> findByIdGreaterThan(Long idAfter, Pageable pageable);

  List<Index> findByIndexClassificationAndIndexNameAndFavorite(
          String indexClassification, String indexName, Boolean favorite, Pageable pageable);

  @Query(
      value = "SELECT i FROM Index i WHERE " +
          "(:indexClassification IS NULL OR i.indexClassification = :indexClassification) " +
          "AND (:indexName IS NULL OR i.indexName LIKE :indexName) " +
          "AND (:favorite IS NULL OR i.favorite = :favorite) " +
          "AND (i.indexClassification > :cursor OR (i.indexClassification = :cursor AND i.id > :idAfter)) " +
          "ORDER BY i.indexClassification ASC, i.id ASC",
      countQuery = "SELECT count(i) FROM Index i WHERE " +
          "(:indexClassification IS NULL OR i.indexClassification = :indexClassification) " +
          "AND (:indexName IS NULL OR i.indexName LIKE :indexName) " +
          "AND (:favorite IS NULL OR i.favorite = :favorite) " +
          "AND (i.indexClassification > :cursor OR (i.indexClassification = :cursor AND i.id > :idAfter))"
  )
  Page<Index> findByIndexClassificationCursorAsc(
      @Param("indexClassification") String indexClassification,
      @Param("indexName") String indexName,
      @Param("favorite") Boolean favorite,
      @Param("cursor") String cursor,
      @Param("idAfter") Long idAfter,
      Pageable pageable
  );


  @Query(
      value = "SELECT i FROM Index i WHERE " +
          "(:indexClassification IS NULL OR i.indexClassification = :indexClassification) " +
          "AND (:indexName IS NULL OR i.indexName LIKE :indexName) " +
          "AND (:favorite IS NULL OR i.favorite = :favorite) " +
          "AND (i.indexClassification < :cursor OR (i.indexClassification = :cursor AND i.id < :idAfter)) " +
          "ORDER BY i.indexClassification DESC, i.id DESC",
      countQuery = "SELECT count(i) FROM Index i WHERE " +
          "(:indexClassification IS NULL OR i.indexClassification = :indexClassification) " +
          "AND (:indexName IS NULL OR i.indexName LIKE :indexName) " +
          "AND (:favorite IS NULL OR i.favorite = :favorite) " +
          "AND (i.indexClassification < :cursor OR (i.indexClassification = :cursor AND i.id < :idAfter))"
  )
  Page<Index> findByIndexClassificationCursorDesc(
      @Param("indexClassification") String indexClassification,
      @Param("indexName") String indexName,
      @Param("favorite") Boolean favorite,
      @Param("cursor") String cursor,
      @Param("idAfter") Long idAfter,
      Pageable pageable
  );


  @Query(
      value = "SELECT i FROM Index i WHERE " +
          "(:indexClassification IS NULL OR i.indexClassification = :indexClassification) " +
          "AND (:indexName IS NULL OR i.indexName LIKE :indexName) " +
          "AND (:favorite IS NULL OR i.favorite = :favorite) " +
          "AND (i.indexName > :cursor OR (i.indexName = :cursor AND i.id > :idAfter)) " +
          "ORDER BY i.indexName ASC, i.id ASC",
      countQuery = "SELECT count(i) FROM Index i WHERE " +
          "(:indexClassification IS NULL OR i.indexClassification = :indexClassification) " +
          "AND (:indexName IS NULL OR i.indexName LIKE :indexName) " +
          "AND (:favorite IS NULL OR i.favorite = :favorite) " +
          "AND (i.indexName > :cursor OR (i.indexName = :cursor AND i.id > :idAfter))"
  )
  Page<Index> findByIndexNameCursorAsc(
      @Param("indexClassification") String indexClassification,
      @Param("indexName") String indexName,
      @Param("favorite") Boolean favorite,
      @Param("cursor") String cursor,
      @Param("idAfter") Long idAfter,
      Pageable pageable
  );


  @Query(
      value = "SELECT i FROM Index i WHERE " +
          "(:indexClassification IS NULL OR i.indexClassification = :indexClassification) " +
          "AND (:indexName IS NULL OR i.indexName LIKE :indexName) " +
          "AND (:favorite IS NULL OR i.favorite = :favorite) " +
          "AND (i.indexName < :cursor OR (i.indexName = :cursor AND i.id < :idAfter)) " +
          "ORDER BY i.indexName DESC, i.id DESC",
      countQuery = "SELECT count(i) FROM Index i WHERE " +
          "(:indexClassification IS NULL OR i.indexClassification = :indexClassification) " +
          "AND (:indexName IS NULL OR i.indexName LIKE :indexName) " +
          "AND (:favorite IS NULL OR i.favorite = :favorite) " +
          "AND (i.indexName < :cursor OR (i.indexName = :cursor AND i.id < :idAfter))"
  )
  Page<Index> findByIndexNameCursorDesc(
      @Param("indexClassification") String indexClassification,
      @Param("indexName") String indexName,
      @Param("favorite") Boolean favorite,
      @Param("cursor") String cursor,
      @Param("idAfter") Long idAfter,
      Pageable pageable
  );


    List<Index> findAll();


  @Query(value = "select i from Index i where " +
      "(:indexClassification is null or i.indexClassification = :indexClassification) and " +
      "(:indexName is null or cast(i.indexName as string) like concat('%', cast(:indexName as string), '%')) and " +
      "(:favorite is null or i.favorite = :favorite)")
  Page<Index> findAllByConditions(
      @Param("indexClassification") String indexClassification,
      @Param("indexName") String indexName,
      @Param("favorite") Boolean favorite,
      Pageable pageable
  );

}
