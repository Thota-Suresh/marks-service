package com.marks.service.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.marks.service.entity.Marks;
@Service
public interface MarksServices {

	public Marks createMarks(Marks marks) throws Exception;
	public  List<Marks> getAllMarks();
	public List<Marks> getMarksByStudentId(Long studentId);
	public List<Marks> getMarksBysubject(String studentId);
}
