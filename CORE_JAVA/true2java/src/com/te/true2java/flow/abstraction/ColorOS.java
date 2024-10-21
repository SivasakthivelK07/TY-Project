package com.te.true2java.flow.abstraction;

public class ColorOS implements AndroidOS {

	@Override
	public void takePicture() {
		System.out.println("Color UI Take Picture");

	}

	@Override
	public void optimizeBattery() {
		System.out.println("Color OS Optimize Battery");

	}

	@Override
	public void nightPhotography() {
		System.out.println("Color OS Night Photography");

	}

}
