package com.cassandra.exampe.demo.repository;

import java.util.Set;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import com.cassandra.exampe.demo.model.User;

public interface UserRepository extends CassandraRepository<User> {

	@Query("SELECT * FROM tms_users WHERE user_id=?0 LIMIT 1")
	User findById(Integer userId);

	@Query("SELECT * FROM tms_users WHERE user_id in (?0) ")
	Iterable<User> getUserListByUserIds(Set<Integer> userIds);

}
