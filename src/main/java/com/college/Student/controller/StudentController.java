package com.college.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.Student.entity.Student;
import com.college.Student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/student")
	public List<Student>getAllStudent()
	{
	return studentService.findAllStudent();
	
}
	@PostMapping("/student")
	public Student createStudent(@RequestBody Student student)
	{ return studentService.createStudent(student);
	
	}
	
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable Long id) {
		return studentService.deleteStudent(id);
	}
	

	
	
}