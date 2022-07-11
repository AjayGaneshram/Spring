package ValueInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileDemo {
/*
 * 
 * Profile demo is used to run only
 * the particular class by using the string
 * mentioned in @profile("xxx")
 * 
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext applicationcontext=new AnnotationConfigApplicationContext();
//using the "dev" value for activate the dev class.
//"Prod" for prod class
applicationcontext.getEnvironment().setActiveProfiles("Dev");	

applicationcontext.register(AppConfig.class,AppConfigDev.class);
applicationcontext.refresh();
Prices order1=(Prices) applicationcontext.getBean(Prices.class);
System.out.println(order1.getValue1());
		
		
	}

}
