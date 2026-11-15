package org.tyss.javaxml;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.tyss.javaxml.dao.Employee;

public class App3 {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Employee employee = new Employee(2, "ln@gmail.com", 60000, "LN01");

		try {
			// Create JAXB context and instantiate Marshaller(covert java to XML)
			JAXBContext context = JAXBContext.newInstance(Employee.class);
			Marshaller marshaller = context.createMarshaller();

			// To format the XML output
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			// Convert the Java object to XML string
			StringWriter writer = new StringWriter();
			marshaller.marshal(employee, writer);
			String xmlFormat = writer.toString();

			System.out.println(xmlFormat);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
