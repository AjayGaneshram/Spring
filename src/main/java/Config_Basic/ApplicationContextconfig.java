package Config_Basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Basic.Address;

public class ApplicationContextconfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Config class method used to create the object 
		 * and bring from developer it
		 * to spring container without annotation(component)
		 * XML file 
		 */		
		ApplicationContext context=new AnnotationConfigApplicationContext(listOfConfigClass.class);
		Address add=(Address) context.getBean("addressnew");
		
		add.print();
		//for commit 
		
	}

}
