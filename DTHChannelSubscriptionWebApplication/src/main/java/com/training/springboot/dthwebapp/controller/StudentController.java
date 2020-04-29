package com.training.springboot.dthwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.dthwebapp.model.Student;
import com.training.springboot.dthwebapp.service.StudentService;
import com.training.springboot.dthwebapp.service.StudentServiceImpl;

@RestController
@RequestMapping("/studentapp")
public class StudentController {
	
	@Autowired
	StudentServiceImpl studentService;
	
	@PostMapping(path="/insertstudent")
	public int insertStudent(@RequestBody Student studentobj)
	{
		int noofrecords=0+1;
		return noofrecords;
		
	}

}
