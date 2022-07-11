package com.college.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.Student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
