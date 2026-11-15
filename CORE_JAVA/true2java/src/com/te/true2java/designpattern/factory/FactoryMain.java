package com.te.true2java.designpattern.factory;

public class FactoryMain {

	public static void main(String[] args) {
		
//		Os os1=new Android();
//		Os os2=new Windows();
//		os1.nameOfOS();
//		os2.nameOfOS();
		
		
		OperatingSystemFactory factory = new OperatingSystemFactory();
		Os os = factory.getInstance("Android");
		os.nameOfOS();
	}
}
