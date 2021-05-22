package com.example.salesforce.repository;

import com.example.salesforce.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ashkan Amiri
 * Date:  2021-05-22
 * Time:  12:04
 * Project: salesForce
 * Copyright: MIT
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
