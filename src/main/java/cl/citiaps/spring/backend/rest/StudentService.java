package cl.citiaps.spring.backend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.citiaps.spring.backend.entities.Student;
import cl.citiaps.spring.backend.repository.StudentRepository;

@RestController  
@RequestMapping("/students")
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Iterable<Student> getAllUsers() {
		return studentRepository.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public  Student findOne(@PathVariable("id") Integer id) {
		return studentRepository.findOne(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Student create(@RequestBody Student resource) {
	     return studentRepository.save(resource);
	}
	 
}