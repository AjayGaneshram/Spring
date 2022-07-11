package Basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AccountDetails implements BeanNameAware,ApplicationContextAware,InitializingBean,DisposableBean{

	private CustomerInfo cusInfo;
	private Address address;
	
	/*
	 * @Inject 
	 * private ApplicationContext appctx;
	 */
	
	public AccountDetails() {
     System.out.println("Inside the Constructor of AccountDetails");
	}
	public CustomerInfo getCusInfo() {
		return cusInfo;
	}
	public void setCusInfo(CustomerInfo cusInfo) {
		
		this.cusInfo = cusInfo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
	
		this.address = address;
	}
	//Business logic
	public void print()
	{
		cusInfo.print();
		
		address.print();
	}
	// it will  print the bean name 
	// what  we passed through the XML
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("SetBeanName "+ name);
		
		
	}
	// this will help to inject the object during the runtime
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Application context "+applicationContext);
	}	
	      ///Init method declaration
			/*
			 * While instantiating the bean,constructor has been called
			 * Init method will call only if the dependency added to that bean
			 * 
			*/
	// 1 st method through Initizilating Bean interface
	public void afterPropertiesSet() throws Exception{
     System.out.println("After property set");
     
	}
	//2nd method...in XML add Init method= method name
	// there is no return type and no arguments for this Init method
	public void testinit() {
		System.out.println("TestInit method using xml configuration");
		
	}
	@PostConstruct
	public void postInit() {
		System.out.println("PostInit method by annotation");
	}
	
	
	//Destroy method
	// 1 st method using disposable bean interface
	/*
	 * Destroy method will applicable for singleton bean
	 * After all performance completed by bean,
	 * Bean will release from IOC container, 
	 * at that time --destroy will take place
	 * 
	*/
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy the bean");
		
	}
	// through XML method
	public void destroyXml () {
		System.out.println("Destroyed through XML method");
	}
	@PreDestroy
	public void destroyPre() {
		System.out.println("PreDestroyed by annotations method");
	}
}
