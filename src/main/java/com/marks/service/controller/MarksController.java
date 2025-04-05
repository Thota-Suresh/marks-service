package com.marks.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marks.service.entity.Marks;
import com.marks.service.services.MarksServices;
@RestController
public class MarksController {

	@Autowired
	MarksServices service;
	
	@PostMapping("/marks")
	public Marks createMarks(@RequestBody Marks marks) throws Exception {
		return service.createMarks(marks);
	}
	@GetMapping("/marks")
	public  List<Marks> getAllmarks() {
		return service.getAllMarks();
	}
	@GetMapping("/marks/{studentId}")
	public  List<Marks> getByStudentID(@PathVariable ("studentId") Long studentId) {
		return service.getMarksByStudentId(studentId);
	}
	@GetMapping("/marks/subject/{subject}")
	public  List<Marks> getBysubject(@PathVariable ("subject") String studentId) {
		return service.getMarksBysubject(studentId);
	}
	
}
