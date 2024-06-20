package com.formationkilo;

public class StateC extends State {
	public void operationA() {
		System.out.println("Passage from state C towards State A!");
		classWithState.setState(new StateA());
	}

	public void operationB() {
		System.out.println("Passage from state C towards State B!");
		classWithState.setState(new StateC());
		
	}

	public void operationC() {
		System.out.println("Already in State C!");
	}

	public void doAction() {
		System.out.println("State C process execution...");
	}

}
