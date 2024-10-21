package com.te.true2java.stream;

import java.util.function.Predicate;

public class BoyEligibility {

	public static void main(String[] args) {
		Boy boy = new Boy(1, "FN1", "LN1", 24);
		Predicate<Boy> predicate = t -> t.getAge() >= 21;
		if (predicate.test(boy)) {
			System.out.println("You eligible for marriage");
		} else {
			System.out.println("Go to school first");
		}

	}

}
