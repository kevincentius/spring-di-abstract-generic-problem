package main.springtest;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class XImpl1 extends X<A, B> {

	@Override
	public void print() {
		System.out.println("print from XImpl1");
	}
	
}
