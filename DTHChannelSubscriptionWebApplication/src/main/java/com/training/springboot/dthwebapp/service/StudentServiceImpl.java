package com.training.springboot.dthwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springboot.dthwebapp.model.Student;
import com.training.springboot.dthwebapp.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public int insertStudent(Student studentobj) {
		
		Student st= studentRepository.save(studentobj);
		 return st.getSid();
	}

}
