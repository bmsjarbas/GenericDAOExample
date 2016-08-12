package com.randomjs.GenericDAOExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.randomjs.GenericDAOExample.domain.entity.Cat;
import com.randomjs.GenericDAOExample.domain.entity.Dog;
import com.randomjs.GenericDAOExample.service.IAnimalService;

/**
 * Hello world!
 *
 */

public class App {
	private final static ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "beans.xml" });
	private final static IAnimalService animalService = (IAnimalService) context.getBean(IAnimalService.class);

	public static void main(String[] args) {
		System.out.println("Let's see type inference in action");

		System.out.println("First, let's create a cat...");
		Cat cat = new Cat("name");
		Cat catFromGenericDAO = create(cat);
		
		System.out.println("Now, a dog...");

		Dog dog = new Dog("some dog name");
		Dog dogFromGenericDAO =create(dog);
		
	    System.out.println("Let's double check, and see if it was really saved...");
	    System.out.println("Instance of " + cat.getClass() +" ## ID: " + cat.getId() );	    
	    System.out.println("Instance of " + dog.getClass() +" ## ID: " + dog.getId());
	    
	    System.out.println("More one");
	    Cat d2 = new Cat("d2");
	    Cat c = create(d2);
	    System.out.println("Instance of " + c.getClass() +" ## ID: " + c.getId());
	}
	
	private static <T> T create(T animal){
		//Just to be self explained :)
		T obj = animalService.create(animal);
		System.out.println("Hey, it is an instance of:" + obj.getClass());
		return obj;
	}
}
