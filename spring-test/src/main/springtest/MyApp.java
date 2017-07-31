package main.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApp {

	@Autowired
	private XImpl1 x1;

	@Autowired
	private XImpl2 x2;
	
}
