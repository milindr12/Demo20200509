package com.milind.demo;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.milind.dao.StudentDao;
import com.milind.model.Student;
@RestController
public class HomeController {

	@Autowired
	StudentDao studentDoa;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("inside controller");
		return "add_student";
	}
	
	@PostMapping("/add_student")
	public Student add_student(@RequestBody Student student) {
		studentDoa.save(student);
		return student;
		
	}
	
	@RequestMapping(path = "/get_student",produces = {"application/xml"} )
	public List<Student> get_student() {

		return studentDoa.findAll();
	}
	
	@RequestMapping("/get_student/{id}")
	public Optional<Student> get_student(@PathVariable("id") int id) {
		

		return studentDoa.findById(id);
	}
}
