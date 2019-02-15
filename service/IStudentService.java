package com.metehan.netas.service;

import java.util.List;

import com.metehan.netas.model.Student;

public interface IStudentService {
	
	List<Student> getAllStudent();
	void saveStudent (final Student student);
	boolean updateStudent (final Student student);
	boolean deleteStudent ( final Student student);

}
