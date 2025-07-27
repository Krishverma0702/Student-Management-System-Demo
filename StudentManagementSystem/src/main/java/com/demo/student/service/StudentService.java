package com.demo.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.student.model.Student;
import com.demo.student.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	
	public StudentRepository studentRepo;
	
	public String saveStud(Student s) {
		String msg = studentRepo.saveData(s);
		return msg;
	}
	
}
