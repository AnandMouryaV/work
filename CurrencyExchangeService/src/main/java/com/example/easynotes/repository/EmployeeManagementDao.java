package com.example.easynotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.easynotes.model.Employee;

@Repository
public interface EmployeeManagementDao extends JpaRepository<Employee, Long> {

}
