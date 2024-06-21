package com.formationkilo.aircraft;

public class AircraftImpl implements Aircraft{
	private State state;
	
	public AircraftImpl() {
		state=new StateOnTheRunway(this);
	}

	@Override
	public void goingOutFromGarage() {
		state.executeGoingOutFromGarage();
		
	}

	@Override
	public void enterTheGarage() {
		state.executeEnterTheGarage();
		
	}

	@Override
	public void takeOff() {
		state.executeTakeOff();
		
	}

	@Override
	public void landAircraft() {
		state.executeLandAircraft();
		
	}

	@Override
	public void doActivity() {
		state.executeDoActivity();
		
	}

	abstract class State{
		protected AircraftImpl aircraft;
		public State(AircraftImpl aircraft) {
			this.aircraft=aircraft;
		}
		abstract void executeGoingOutFromGarage();//State transition operation
		abstract void executeEnterTheGarage();//State transition operation
		abstract void executeTakeOff();//State transition operation
		abstract void executeLandAircraft();//State transition operation
		abstract void executeDoActivity();//Activity
	}
	
	class StateOnTheRunway extends State{
		public StateOnTheRunway(AircraftImpl aircraft) {
			super(aircraft);
		}

		@Override
		void executeGoingOutFromGarage() {
			System.out.println("Already on the runway!Going Out From Garage Impossible ");
			
		}

		@Override
		void executeEnterTheGarage() {
			System.out.println("Transition from state 'StateOnTheRunway' to 'EnterTheGarage'  ");
			aircraft.state=new AtTheGarage(aircraft);
			
		}

		@Override
		void executeTakeOff() {
			System.out.println("Transition from state 'StateOnTheRunway' to 'EnterTheGarage'  ");
			state=new OnTheAir(aircraft);
		}

		@Override
		void executeLandAircraft() {
			System.out.println("Alreay the Runway. Operation Impossible!");
			
		}

		@Override
		void executeDoActivity() {
			for(int i=0;i<10;i++) {
				System.out.println("State activity on runway...");
			}
			
		}
		
	}
	class AtTheGarage extends State{

		public AtTheGarage(AircraftImpl aircraft) {
			super(aircraft);
			// TODO Auto-generated constructor stub
		}

		@Override
		void executeGoingOutFromGarage() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void executeEnterTheGarage() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void executeTakeOff() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void executeLandAircraft() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void executeDoActivity() {
			// TODO Auto-generated method stub
			
		}
		
	}
	class OnTheAir extends State{

		public OnTheAir(AircraftImpl aircraft) {
			super(aircraft);
			// TODO Auto-generated constructor stub
		}

		@Override
		void executeGoingOutFromGarage() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void executeEnterTheGarage() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void executeTakeOff() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void executeLandAircraft() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void executeDoActivity() {
			// TODO Auto-generated method stub
			
		}
		
	}

}
