package jp.co.tc.recruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.tc.recruit.view.TotalStatusView;

public interface TotalStatusRepository extends JpaRepository<TotalStatusView, Integer>{
	public TotalStatusView findBySelectionStatusId(Integer selectionStatusId);
}
