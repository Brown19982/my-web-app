package idv.matt.service.impl;

import org.springframework.stereotype.Service;

import idv.matt.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String getHello() {
		// TODO Auto-generated method stub
		return "Hello";
	}

}
