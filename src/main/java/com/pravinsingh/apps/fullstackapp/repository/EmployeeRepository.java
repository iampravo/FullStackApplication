package com.pravinsingh.apps.fullstackapp.repository;

import com.pravinsingh.apps.fullstackapp.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Person,Long> {
}
