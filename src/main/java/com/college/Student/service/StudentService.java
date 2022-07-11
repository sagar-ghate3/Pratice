package com.college.Student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.Student.entity.Student;
import com.college.Student.repository.StudentRepository;


@Service
public class StudentService {

	
	@Autowired
	StudentRepository studentRepository;
	
	
	public List<Student> findAllStudent(){
		return studentRepository.findAll();
	}
	
	
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public String deleteStudent(Long id) {
	Optional<Student>optionalStud=studentRepository.findById(id);
	Student stud=optionalStud.get();
	studentRepository.delete(stud);
	return stud.getName()+"      Deleted Student";
	
	}		
}
