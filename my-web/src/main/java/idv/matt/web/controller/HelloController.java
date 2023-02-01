package idv.matt.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import idv.matt.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;

	@GetMapping("/hello")
	public String getHello() {
		System.out.println(helloService.getHello());
		return helloService.getHello();
	}

}
