package com.progrank.DemoJersey;

import java.util.*;
//import java.util.List;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("students")
public class StudnetResource {
		
	StudentDao dao = new StudentDao();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudent() {
		return dao.getAllStudent();
	}
	@GET
	@Path("studentsId/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student studentById(@PathParam("id")int studentId) {
		return dao.getStudentById(studentId);
	}
	
	@POST
	@Path("addStudent")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student>addStudent(Student student){
		return dao.createStudent(student);
	}
	
	@DELETE
	@Path("getStudent/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> removeStudent(@PathParam("id")int studentId) {
		return dao.removeStudent(studentId);
	}
	
	@PUT
	@Path("updateStudent/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> updateStudent(@PathParam("id")int studentId, Student student) {
		return dao.updateStudent(studentId, student.getStudentName());
	}
	
}
