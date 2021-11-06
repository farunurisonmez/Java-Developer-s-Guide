package applicationSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdemo.IocConfig;

public class Main {

	public static void main(String[] args) {
	    
	    AnnotationConfigApplicationContext context = 
		    new AnnotationConfigApplicationContext(IocConfig.class);
	    ICustomerService customerService = 
		    context.getBean("service",ICustomerService.class);
	    
	    customerService.add();
	}
}