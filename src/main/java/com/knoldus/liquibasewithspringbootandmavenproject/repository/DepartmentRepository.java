package com.knoldus.liquibasewithspringbootandmavenproject.repository;

import com.knoldus.liquibasewithspringbootandmavenproject.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
