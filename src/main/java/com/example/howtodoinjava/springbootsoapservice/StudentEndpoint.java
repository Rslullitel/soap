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
	private static final String MSG_ERROR = "Ocurrio un error al intentar guardar la lista de estudiantes";
	private static final String MSG_SUCCESS = "La lista de estudiantes se guardo exitosamente";

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

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "StudentListRequest")
	@ResponsePayload
	public StudentListResponse saveListStudent(@RequestPayload StudentListRequest request){
		StudentListResponse response = new StudentListResponse();
		if(request == null){
			response.setMsg(MSG_ERROR); //tirar mensaje de error (excepcion)
		}else{
			for(Student s : request.getStudents()){
				StudentRepository.addStudent(s);
			}
			response.setMsg(MSG_SUCCESS);// mensaje de guardado exitoso
		}

		return response;
	}
}