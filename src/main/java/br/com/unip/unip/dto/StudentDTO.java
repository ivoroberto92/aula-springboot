package br.com.unip.unip.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.unip.unip.model.Gender;
import br.com.unip.unip.model.Student;

public class StudentDTO {

	private Long id;
	private String name;
	private Gender gender;

	public StudentDTO() {
	}
	
	public StudentDTO(Student student) {
		this.id = student.getId();
		this.name = student.getName();
		this.gender = student.getGender();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public static List<StudentDTO> toConvert(List<Student> studenties) {	
		return studenties.stream().map(StudentDTO::new).collect(Collectors.toList());
	}


}
