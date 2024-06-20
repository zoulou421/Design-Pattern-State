package com.formationkilo;

public abstract class State {
 protected ClassWithState classWithState;
 public abstract void operationA();
 public abstract void operationB();
 public abstract void operationC();
 public abstract void doAction();
 public void setClassWithState(ClassWithState classWithState) {
	this.classWithState = classWithState;
 }
 
 
 
}
