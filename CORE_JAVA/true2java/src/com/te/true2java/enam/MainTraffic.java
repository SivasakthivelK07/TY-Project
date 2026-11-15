package com.te.true2java.enam;

class Traffic {

}

class RED extends Traffic {

	private final String name;

	public RED(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

public class MainTraffic {
	public static void main(String[] args) {
		RED red = new RED("Red");

		System.out.println(red.getName());

	}
}
