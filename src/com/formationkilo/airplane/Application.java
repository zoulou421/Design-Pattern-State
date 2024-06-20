package com.formationkilo.airplane;

public class Application {

	public static void main(String[] args) {
     Airplane a=new Airplane();
     a.doAction();
     a.takeOff();
     a.doAction();
     ///////
     a.goingOutOfTheGarage();
     a.takeOff();
     a.takeOff();
     a.doAction();
     a.setFuel(2000);
     a.takeOff();
     a.doAction();
	}

}
