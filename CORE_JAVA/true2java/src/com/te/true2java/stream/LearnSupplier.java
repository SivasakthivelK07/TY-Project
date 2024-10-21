package com.te.true2java.stream;

import java.util.function.Supplier;

public class LearnSupplier {

	public static void main(String[] args) {
		Supplier<LearnSupplier> supplier = () -> new LearnSupplier();
		LearnSupplier employee = supplier.get();
		System.out.println(employee);
		
		System.out.println(supplier);

	}

}
