package com.cassandra.exampe.demo.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import com.cassandra.exampe.demo.model.Previleges;

public interface PrevilegesRepository extends CassandraRepository<Previleges> {

	@Query("SELECT * FROM tms_previleges WHERE previlege_id=?0 LIMIT 1")
	Previleges findById(Integer deptId);

}
