package com.marks.service.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marks.service.entity.Marks;

public interface MarksDao extends JpaRepository<Marks, Long> {

	List<Marks> findByStudentId(Long studentId);

	List<Marks> findBySubject(String studentId);

	Marks findBySubjectAndStudentId(String subject, long studentId);

}
