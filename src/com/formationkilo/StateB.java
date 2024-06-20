package com.formationkilo;

public class StateB extends State {
	public void operationA() {
		System.out.println("Passage impossible from B to A state");
	}

	public void operationB() {
		System.out.println("Already in State B!");
		
	}

	public void operationC() {
		System.out.println("Passage from state B towards State C!");
		classWithState.setState(new StateC());
	}

	public void doAction() {
		System.out.println("State B process execution...");
	}
	
}
