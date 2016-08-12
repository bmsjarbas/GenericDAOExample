package com.randomjs.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dog {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	
	public Dog(){}
	public Dog(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
