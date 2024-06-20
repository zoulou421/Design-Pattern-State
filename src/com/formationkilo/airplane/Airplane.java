package com.formationkilo.airplane;

import com.formationkilo.airplane.Airplane.StateAirPlane;

public class Airplane {
	private int fuel;
	private StateAirPlane stateAirPlane;
    //Initialisation
	
	public  Airplane() {
		stateAirPlane= new AtTheGarage();
		fuel=0;
	}
	public void enterTheGarage() {
		stateAirPlane.enterTheGarage();
	}

	public void goingOutOfTheGarage() {
		stateAirPlane.goingOutOfTheGarage();
	}

	public void takeOff() {
		stateAirPlane.takeOff();
	}

	public void landPlane() {
		stateAirPlane.landPlane();
	}

	public void doAction() {
		stateAirPlane.doAction();
	}

	interface StateAirPlane{
		public void enterTheGarage();
		public void goingOutOfTheGarage();
		public void takeOff();
		public void landPlane();
		public void doAction();
	}
	class AtTheGarage implements StateAirPlane{

		@Override
		public void enterTheGarage() {
			System.out.println("Already at the garage!");
			
		}

		@Override
		public void goingOutOfTheGarage() {
			
			System.out.println("State transition from garage to on the take-off runway!");
			stateAirPlane=new OnTakeOffRunway();
		}

		@Override
		public void takeOff() {
			System.out.println("Impossible takeOff to take off!");
			
		}

		@Override
		public void landPlane() {
			System.out.println("You still in the garage.Operation landPlane impossible!");
			
		}

		@Override
		public void doAction() {
			System.out.println("Garage...Starting Plane...");
			
		}
		
	}
	
	class OnTakeOffRunway implements StateAirPlane{

		@Override
		public void enterTheGarage() {
			System.out.println("State transition from OnTakeOffRunway to on the garage!");
			stateAirPlane=new AtTheGarage();
			
		}

		@Override
		public void goingOutOfTheGarage() {
			System.out.println("Already on the Airplane land");
			
		}

		@Override
		public void takeOff() {
			if(fuel>500) {
				System.out.println("State transition from OnTakeOffRunway to Air");
				stateAirPlane=new OnTheAir();
			}else {
				System.out.println("fuel is low!");

			}
			
		}

		@Override
		public void landPlane() {
			System.out.println("Impossible.Already on the Airplane land");
			
		}

		@Override
		public void doAction() {
			System.out.println("...Step OnTakeOffRunway....");
			
		}
		
	}
	class OnTheAir implements StateAirPlane{

		@Override
		public void enterTheGarage() {
			System.out.println("Action enterTheGarage impossible. You're on the AIR");
			
		}

		@Override
		public void goingOutOfTheGarage() {
			System.out.println("Action goingOutOfTheGarage impossible. You're on the AIR");
			
		}

		@Override
		public void takeOff() {
			System.out.println("Action takeOff impossible. You're on the AIR");
			
			
		}

		@Override
		public void landPlane() {
			System.out.println("Transition from AIR to Landing Plane...");
			stateAirPlane=new OnTakeOffRunway();
			
			
		}

		@Override
		public void doAction() {
			System.out.println("...Step On The Air...");
			
		}
		
		
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	
	
}
