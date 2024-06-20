package com.formationkilo;

public class StateA  extends State{
	public void operationA() {
		System.out.println("Already in State A!");
	}

	public void operationB() {
		System.out.println("Passage from state A towards State B!");
		classWithState.setState(new StateB());
		
	}

	public void operationC() {
		System.out.println("Passage impossible from C to A state");
	}

	public void doAction() {
		System.out.println("State A process execution...");
	}
}
