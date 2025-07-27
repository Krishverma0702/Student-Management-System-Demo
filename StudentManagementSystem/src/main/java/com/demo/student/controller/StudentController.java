package com.demo.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.student.model.Student;
import com.demo.student.service.StudentService;

@Controller

public class StudentController {
	
	@Autowired
	public StudentService studentService;
	
	@GetMapping("/")
	public String showForm(Model model) {

		model.addAttribute("student", new Student());
		return "index";
	}
	
	@PostMapping("/saveStudent")
	public String sendForm(@ModelAttribute("student") Student s, Model model) {
		String msg = studentService.saveStud(s);
		model.addAttribute("save", msg);
		return "output";
	}
	
}
