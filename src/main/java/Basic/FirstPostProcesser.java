package Basic;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class FirstPostProcesser implements Ordered,BeanPostProcessor {
    // set the highest precedence
	//helps to prioritize post processor if two or more processor are present 
	public int getOrder() {
		// TODO Auto-generated method stub
		return Ordered.HIGHEST_PRECEDENCE;
	}
	// we can change the domain object by post processor
	//without changing in domain object directly
	//because every object has passes as parameter in post processor
	 public Object postProcessAfterInitialization(Object bean, String beanName)
	            throws BeansException {
	        // TODO Auto-generated method stub
	           System.out.println("I am after intialisation");
			return bean;
	        }
	 public Object postProcessBeforeInitialization(Object bean, String beanName)
	            throws BeansException {
	        // TODO Auto-generated method stub
	           System.out.println("I am before intialisation");
			return bean;
	        }
	 
}
