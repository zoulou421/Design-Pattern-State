package com.formationkilo;

public class StateA {
	public void operationA() {
		System.out.println("Already in State A!");
	}

	public void operationB() {
		System.out.println("Passage from State A to State B!");
		
	}

	public void operationC() {
		System.out.println("Passage from State B to State C!");
	}

	public void doAction() {
		System.out.println("State A process execution...");
	}
}
