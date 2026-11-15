package com.te.true2java.designpattern.factory;

public class OperatingSystemFactory {

	public Os getInstance(String str) {
		if (str.equalsIgnoreCase("android")) {
			return new Android();
		} else if (str.equalsIgnoreCase("Ios")) {
			return new Ios();
		} else {
			return new Windows();
		}

	}
}
