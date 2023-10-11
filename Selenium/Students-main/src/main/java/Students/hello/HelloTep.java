package Students.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTep {
	@RequestMapping(method = RequestMethod.GET, path = "/helloStudent")
	public String helloTep() {
		return "Hello Tep, well come";

	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/helloStudentBean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello Tep, well come to home");

	}
	///helloTep/path-variable/Faruq
	@RequestMapping(method = RequestMethod.GET, path = "/helloStudent/path-variable/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello Tep, well come to home, %s", name));

	}
}
