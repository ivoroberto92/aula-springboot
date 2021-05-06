package br.com.unip.unip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unip.unip.dto.StudentDTO;
import br.com.unip.unip.model.Student;
import br.com.unip.unip.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping
	public List<StudentDTO> listAll() {
	 List<Student> studenties = studentService.listAll();
	 List<StudentDTO> studentiesDTO = StudentDTO.toConvert(studenties);
	 return studentiesDTO;
	}
}
