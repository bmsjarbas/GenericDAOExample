package com.randomjs.GenericDAOExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.randomjs.dao.interfaces.IGenericDAO;
import com.randomjs.domain.entity.Cat;
import com.randomjs.domain.entity.Dog;


/**
 * Hello world!
 *
 */
public class App 
{
	@Autowired
	IGenericDAO dao;
	public App(IGenericDAO dao){
		this.dao = dao;
	}
    public static void main( String[] args )
    {    	
    	ApplicationContext context =
    	    	  new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
    	System.out.println("Let's see type inference in action");
    	
    	 App app = (App)context.getBean("AppBean");
    	Cat cat = new Cat("name");
    	Cat catFromGenericDAO = app.getDAO().create(cat);       
    	System.out.println("catFromGenericDAO is an instance of: " + catFromGenericDAO.getClass() ); 
    	
    	System.out.println("Now will pass an instance of Dog to the same dao");
    	
    	Dog dog = new Dog("some dog name");
    	Dog dogFromGenericDAO = app.getDAO().create(dog);
    	System.out.println("dogFromGenericDAO is an instance of: " + dogFromGenericDAO.getClass() );   
    }
    
    public IGenericDAO getDAO(){
    	return this.dao;
    }
    
    
    
    
}
