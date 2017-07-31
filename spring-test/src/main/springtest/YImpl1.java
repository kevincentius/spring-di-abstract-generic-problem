package main.springtest;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class YImpl1 extends Y<A, XImpl1> {

	@Override
	public void print() {
		System.out.println("print from YImpl1");
	}
	
}
