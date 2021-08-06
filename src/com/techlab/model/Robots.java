package com.techlab.model;

public class Robots implements IWorkable{
	@Override
	public void startWork() {
		System.out.println("Robots have started working.");
	}

	@Override
	public void stopWork() {
		System.out.println("Robots have finished working.");
	}

	@Override
	public void startEat() {
		System.out.println("Robots have started eating.");
	}

	@Override
	public void stopEat() {
		System.out.println("Robots have finished eating.");
	}
}
