package jp.co.tc.recruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.tc.recruit.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	public User findByUsername(String username);

}
