package com.te.true2java.flow.abstraction;

public class MIUI implements AndroidOS {

	@Override
	public void takePicture() {
		System.out.println("MI UI Take Picture");
	}

	@Override
	public void optimizeBattery() {
		System.out.println("MI UI Optimize Battery");
	}

	@Override
	public void nightPhotography() {
		System.out.println("MI UI Night Photography");

	}

}
