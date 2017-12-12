package com.cassandra.exampe.demo.repository;

import java.util.Set;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import com.cassandra.exampe.demo.model.Role;

public interface RoleRepository extends CassandraRepository<Role> {
	
	@Query("SELECT*FROM tms_role WHERE role_id=?0 LIMIT 1")
    Role findById(Integer roleId);
	
	@Query("SELECT * FROM tms_role WHERE role_id in (?0) ")
	Iterable<Role> getRoleListByRoleIds(Set<Integer> roleIds);

}
