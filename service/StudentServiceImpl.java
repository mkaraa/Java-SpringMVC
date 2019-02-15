package com.metehan.netas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metehan.netas.model.Student;
import com.metehan.netas.repository.StudentRepository;

@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	private List<Student> list = new ArrayList<Student>();

	@Override
	public List<Student> getAllStudent() {
		List<Student> list = new ArrayList<Student>();
		for(Student s : studentRepository.findAll()) { 
			list.add(s);
		}
		return list;
	}

	@Override
	public void saveStudent(Student student) {
		studentRepository.save(student);
		
	}

	@Override
	public boolean updateStudent(Student student) {
		studentRepository.save(student);
		return true;
	}

	@Override
	public boolean deleteStudent(Student student) {
		studentRepository.delete(student);
		return true;
	}
	
}
