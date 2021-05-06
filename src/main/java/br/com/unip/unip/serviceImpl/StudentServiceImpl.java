package br.com.unip.unip.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unip.unip.model.Student;
import br.com.unip.unip.repository.StudentRepository;
import br.com.unip.unip.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> listAll() {
		List<Student> student =  studentRepository.findAll();
		return student;
	}


}
