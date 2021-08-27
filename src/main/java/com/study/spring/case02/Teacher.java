package com.study.spring.case02;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.List;

public class Teacher {
	private Integer id;
	private String name;
	private Set<Student> students;
	private List<String> subject;
	private Map<String,Integer> salary;
	private Integer studentAllCredit = 0;
	
	private void calcStudentAllCredit() {
		students.stream().forEach(s -> studentAllCredit += s.getAllCredits() );
	}
	
	public Integer getTotalStudentsCredits() {
		calcStudentAllCredit();
		return studentAllCredit;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> student) {
		this.students = student;
	}
	
	
	public List<String> getSubject() {
		return subject;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

	public Map<String, Integer> getSalary() {
		return salary;
	}

	public void setSalary(Map<String, Integer> salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, students);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(students, other.students);
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", students=" + students + ", subject=" + subject + ", salary="
				+ salary + "]";
	}
	
	

	


	
	

}
