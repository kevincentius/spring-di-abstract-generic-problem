package main.springtest;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public abstract class Y<M, C extends X<M, ?>> {

	protected C control;

	public void print() {
		System.out.println("print from Y");
	}
	
}
