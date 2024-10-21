package com.te.true2java.flow.finalreferencevar;

public class MainStudent {

	public static void main(String[] args) {
		Student student = new Student("siva",24,"siva@gmail.com",new Address());
		
		System.out.println(student.getAddress().hashCode());
		
		student.getAddress().setCity("Bangalore");
		student.getAddress().setCountry("India");
		student.getAddress().setSate("Karnataka");
		System.out.println("===========================");
		System.out.println(student.getAddress().getCity());
		System.out.println(student.getAddress().getCountry());
		System.out.println(student.getAddress().getSate());
		
		System.out.println(student.getAddress().hashCode());
		
		System.out.println("============================");
		student.getAddress().setCity("Chennai");
		student.getAddress().setCountry("India");
		student.getAddress().setSate("TamilNadu");
		System.out.println("===========================");
		System.out.println(student.getAddress().getCity());
		System.out.println(student.getAddress().getCountry());
		System.out.println(student.getAddress().getSate());
		
		System.out.println(student.getAddress().hashCode());

	}

}
