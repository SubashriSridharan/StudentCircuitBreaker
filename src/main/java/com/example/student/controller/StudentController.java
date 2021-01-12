package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.Student;
import com.example.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getStudentDetail(){
		
		List<Student> student =studentService.getStudentDetails();
		
		return new ResponseEntity<List<Student>>(student, HttpStatus.OK);
	}
}
