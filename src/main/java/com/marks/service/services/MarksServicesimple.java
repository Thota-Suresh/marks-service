package com.marks.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.marks.service.dao.MarksDao;
import com.marks.service.entity.Marks;
import com.marks.service.exception.MarksExceptions;

@Component
public class MarksServicesimple implements MarksServices {

	@Autowired
	MarksDao dao;

	@Override
	public Marks createMarks(Marks marks) throws Exception {
		Marks entity = dao.findBySubjectAndStudentId(marks.getSubject(), marks.getStudentId());
		if (entity == null) {
			return dao.save(marks);

		} else {
			throw new MarksExceptions("already marks data aviable ");
		}
	}

	@Override
	public List<Marks> getAllMarks() {
		List<Marks> marksList = dao.findAll();
		return marksList;
	}

	@Override
	public List<Marks> getMarksByStudentId(Long studentId) {
		List<Marks> marksList = dao.findByStudentId(studentId);
		return marksList;
	}

	@Override
	public List<Marks> getMarksBysubject(String studentId) {
		List<Marks> marksList = dao.findBySubject(studentId);
		System.out.println(marksList);
		return marksList;
	}

}
