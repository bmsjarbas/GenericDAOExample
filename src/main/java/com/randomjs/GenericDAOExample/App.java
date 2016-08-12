package com.randomjs.GenericDAOExample;

import java.io.Console;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.randomjs.GenericDAOExample.dao.GenericDAO;
import com.randomjs.GenericDAOExample.domain.entity.Cat;
import com.randomjs.GenericDAOExample.domain.entity.Dog;
import com.randomjs.GenericDAOExample.service.AnimalService;
import com.randomjs.GenericDAOExample.service.IAnimalService;


/**
 * Hello world!
 *
 */

public class App 
{
	
	
    public static void main( String[] args )
    {    	
    	ApplicationContext context =
    	    	  new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
    	System.out.println("Let's see type inference in action");   	
    	
    	IAnimalService animalService = (IAnimalService) context.getBean(IAnimalService.class);    	
    	Cat cat = new Cat("name");
    	
    	Cat catFromGenericDAO = animalService.create(cat);       
    	System.out.println("catFromGenericDAO is an instance of: " + catFromGenericDAO.getClass() ); 
    	
    	System.out.println("Now will pass an instance of Dog to the same dao");
    	
    	Dog dog = new Dog("some dog name");
    	Dog dogFromGenericDAO = animalService.create(dog);
    	System.out.println("dogFromGenericDAO is an instance of: " + dogFromGenericDAO.getClass() );   
    }
}
