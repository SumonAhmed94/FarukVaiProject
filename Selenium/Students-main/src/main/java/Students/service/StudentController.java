package Students.service;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class StudentController {
	@Autowired
	private StudentDaoService service;

	@GetMapping("/students")
	public List<Students> retriveAllStudents() {
		return service.findAllStudent();
	}

	@GetMapping("/students/{sId}")
	public Students retriveOneStudent(@PathVariable int sId) {
		Students student = service.findOneStudent(sId);
		if (student == null)
			throw new UserNotFoundException("Student id: " + sId);
		return student;
	}

	@PostMapping("/students")
	public ResponseEntity<Object> createStudents(@RequestBody Students student) {
		Students savedStudent = service.saveStudent(student);
		URI location = UriComponentsBuilder
				.fromPath("/{sId}")
				.buildAndExpand(savedStudent.getsId())
				.toUri();
		return ResponseEntity.created(location).build();

	}
	@DeleteMapping("/students/{sId}")
	public void deleteStudentById(@PathVariable int sId) {
		Students student=service.deleteStudent(sId);
		if(student.getsId()==null)
				throw new UserNotFoundException(sId +" is invalid");
	}

}
