package jp.co.tc.recruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jp.co.tc.recruit.entity.Selection;
import jp.co.tc.recruit.entity.Selection.SelectionPK;

public interface SelectionRepository extends JpaRepository<Selection, SelectionPK> {
	public Selection findBySlcPK(SelectionPK slcPK);

	@Query(value="DELETE FROM XXTC_SELECTION WHERE candidate_id = :id", nativeQuery=true)
	public Integer deleteByCandidateId(@Param("id") Integer id);
}
