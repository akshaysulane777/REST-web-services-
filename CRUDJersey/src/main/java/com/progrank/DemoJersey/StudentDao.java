package com.progrank.DemoJersey;

import java.util.*;
import java.util.stream.Collectors;

public class StudentDao {
	List<Student>students;
	
	public StudentDao(){
	students = new ArrayList<Student>();

		Student student1 = new Student(101, "Akshay");
		Student student2 = new Student(102, "Ajinkya");
		Student student3 = new Student(103, "Sujan");
		
	
	students.addAll(Arrays.asList(student1,student2,student3));
}
	
	public List<Student> getAllStudent(){
	
	return students;
}
public Student getStudentById(int studentId){

return students.stream().filter(x->x.getStudentId() == studentId).collect(Collectors.toList()).get(0);
}

public List<Student> createStudent(Student student)
{
	students.add(student); 
	return students;
}
public List<Student> removeStudent(int id){
students.removeIf(x->x.getStudentId()==id);
return students;
}


public List<Student>updateStudent(int id, String StudentName)
{
	students.stream().filter(x->x.getStudentId() == id).collect(Collectors.toList()).get(0).setStudentName(StudentName);
	return students;
}
}