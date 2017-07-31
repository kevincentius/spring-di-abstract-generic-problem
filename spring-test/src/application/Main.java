package application;
	
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.springconfig.ApplicationContextConfig;
import main.springtest.MyApp;


public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		ctx.getBean(MyApp.class);
	}
	
}
