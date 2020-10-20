package com.example.howtodoinjava.springbootsoapservice;

import com.howtodoinjava.xml.school.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class StudentEndpoint {
	private static final String NAMESPACE_URI = "http://www.howtodoinjava.com/xml/school";

	private StudentRepository StudentRepository;

	@Autowired
	public StudentEndpoint(StudentRepository StudentRepository) {
		this.StudentRepository = StudentRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "StudentDetailsRequest")
	@ResponsePayload
	public StudentDetailsResponse getStudent(@RequestPayload StudentDetailsRequest request) {
		StudentDetailsResponse response = new StudentDetailsResponse();
		response.setStudent(StudentRepository.findStudent(request.getName()));

		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "StudentRequest")
	@ResponsePayload
	public StudentResponse addStudent(@RequestPayload StudentRequest request){
		StudentResponse response = new StudentResponse();
		StudentRepository.addStudent(request.getStudent());
		response.setStudent(StudentRepository.findStudent(request.getStudent().getName()));

		return response;
	}
}