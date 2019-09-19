package com.xerago.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;


public interface EmployeeRepository extends CassandraRepository<Employee, Integer> {

}
