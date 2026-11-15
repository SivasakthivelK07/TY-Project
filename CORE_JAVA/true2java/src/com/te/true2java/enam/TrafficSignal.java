package com.te.true2java.enam;

public enum TrafficSignal {
	RED("Red"), GREEEN("Green"), YELLOW("Yellow");

	private final String type;

	TrafficSignal(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public static void main(String[] args) {
		System.out.println(YELLOW.getType());
	}
}

// RED => new TrafficSignal();//123
// GREEN => new TrafficSignal();//456