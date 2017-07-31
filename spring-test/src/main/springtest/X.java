package main.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public abstract class X<M, D> {

	protected M data;
	protected D delegate;
	
	@Autowired
	protected Y<M, X<M, D>> y;
	
	public void print() {
		System.out.println("print from X");
	}
	
}
