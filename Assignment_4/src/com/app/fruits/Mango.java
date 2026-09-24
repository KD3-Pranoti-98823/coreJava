package com.app.fruits;

public class Mango extends Fruit {
	public Mango(String name ,double weight,String color) {
		super(name,weight,color);
	}

	@Override
	public String taste(){
		return "Sweet";
		
	}
}
