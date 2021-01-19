package com.StudentConsumer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.StudentConsumer.Entity.Student;

@RestController
public class StudentConsuemrController {

	@Autowired
	private RestTemplate restTemplate;

//Saves a student Object
	@PostMapping("/save")
	public String save(@RequestBody Student student) {

		String url = "http://localhost:8050/save-api/save/";
		restTemplate.postForObject(url, student, Student.class);
		return "Saved Sucessfully";
	}

//Gets a list of Students
	@SuppressWarnings("unchecked")
	@RequestMapping(path = "/getall", method = RequestMethod.GET)
	public List<Student> getall() {
		String url = "http://localhost:8050/get-api/get/all";
		 List<Student> list = restTemplate.getForObject(url, List.class);
		return list;
	}

//Gets a Student with given id
	@RequestMapping(path = "/getbyid/{id}", method = RequestMethod.GET)
	public Student getById(@PathVariable Integer id) {
		String url = "http://localhost:8050/get-api/get/getbyid/";
		Student student = restTemplate.getForObject(url + id, Student.class);
        return student;
	}

//Updates branch of a Student
	@GetMapping("updatebranch/{id}/{branch}")
	public Student updateBranch(@PathVariable String id, @PathVariable String branch) {
		String url = "http://localhost:8050/update-api/update/branch/";
		Student student = restTemplate.getForObject(url+ id + "/" + branch, Student.class);
		return student;
	}

//	Updates Age of a Student
	@GetMapping("updateage/{id}/{age}")
	public Student updateage(@PathVariable Integer id, @PathVariable Integer age) {
		String url = "http://localhost:8050/update-api/update/branch/";
//		Map<String, Integer> params = new HashMap<String, Integer>();// Another approach to bind pathvariables with resttemplate url
//		params.put("id", id);
//		params.put("age", age);
		
		Student student = restTemplate.getForObject(url+id + "/" + age, Student.class);
		return student;
		}
		
	

//Deletes a Student with given id
	@DeleteMapping("del/{id}")
	public String delete(@PathVariable Integer id) {
		String url = "http://localhost:8050/del-api/del/";
		if(getById(id)!=null) {
		restTemplate.delete(url + id);
		return "Record removed successfully";
		}
		else {return "Record doesn't exist";}
	}
}
