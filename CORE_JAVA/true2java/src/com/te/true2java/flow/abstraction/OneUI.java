package com.te.true2java.flow.abstraction;

public class OneUI implements AndroidOS {

	@Override
	public void takePicture() {
		System.out.println("One UI Take Picture");
	}

	@Override
	public void optimizeBattery() {
		System.out.println("One UI Optimize Battery");
	}

	@Override
	public void nightPhotography() {
		System.out.println("One UI Night Photography");

	}

}
