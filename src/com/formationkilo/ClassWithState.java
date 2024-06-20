package com.formationkilo;

public class ClassWithState {
	private State state;

	public void operationA() {
		state.operationA();
	}

	public void operationB() {
		state.operationB();
	}

	public void operationC() {
		state.operationC();
	}

	public void doAction() {
		state.doAction();
	}

	public ClassWithState() {
		this.state = new StateA();
		state.setClassWithState(this);
	}

	public void setState(State state) {
		this.state = state;
		state.setClassWithState(this);
	}
	
	
	

}
