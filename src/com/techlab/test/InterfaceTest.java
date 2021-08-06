package com.techlab.test;

import com.techlab.model.IWorkable;
import com.techlab.model.Managers;
import com.techlab.model.Robots;

public class InterfaceTest {

	public static void main(String[] args) {
		doAllJobs(new Managers());
		doAllJobs(new Robots());
	}
	public static void doAllJobs(IWorkable i) {
		i.startWork();
		i.stopWork();
		i.startEat();
		i.stopEat();
	}
}
