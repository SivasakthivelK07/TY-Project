package org.tyss.javaxml;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.tyss.javaxml.dao.Employee;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n" + "<employee>\r\n"
				+ "    <empemail>ln@gmail.com</empemail>\r\n" + "    <empid>2</empid>\r\n"
				+ "    <empname>LN01</empname>\r\n" + "    <empsalary>60000.0</empsalary>\r\n" + "</employee>";

		try {
			JAXBContext context = JAXBContext.newInstance(Employee.class);
			// Create Unmarshaller(convert XML to java)
			Unmarshaller unmarshaller = context.createUnmarshaller();

			// Unmarshal the XML string to a Java object
			StringReader reader=new StringReader(xml);
			Employee employee =(Employee) unmarshaller.unmarshal(reader);
			System.out.println(employee);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
