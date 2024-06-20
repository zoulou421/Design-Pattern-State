package com.formationkilo;

public class ClassWithState {
	private State state;

	public ClassWithState(State state) {
		this.state = state;
		state.setClassWithState(this);
	}

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

	public void setState(State state) {
		this.state = state;
	}
	
	

}
