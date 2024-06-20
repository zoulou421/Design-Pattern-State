package com.formationkilo;

public class Application {

	public static void main(String[] args) {
		ClassWithState c=new ClassWithState();
		c.doAction();
		c.operationA();
		System.out.println("--------");
		c.operationB();
		c.doAction();
		
		System.out.println("--------");
		c.operationA();
		c.doAction();
		
		System.out.println("----------");
		c.operationC();
		c.doAction();
		

	}

}
