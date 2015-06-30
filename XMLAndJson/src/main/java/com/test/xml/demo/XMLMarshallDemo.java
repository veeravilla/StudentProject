package com.test.xml.demo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;
import com.test.Address;
import com.test.Student;

public class XMLMarshallDemo {

	public static void main(String[] args)  throws Exception{
		
		//Student student = new Student(456,"Jhon",4500,new Address("Plymouth", "MN", "55447"));
		JAXBContext jc = JAXBContext.newInstance("com.test");	
		/*Marshaller marshaller = jc.createMarshaller();
		marshaller.marshal(student, System.out);*/
		
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Student student = (Student)unmarshaller.unmarshal( new File("C:\\MayWorkspace\\workspace\\XMLAndJson\\src\\main\\resources\\student.xml") ); // ok
        
        System.out.println(student);
        
        Gson gson = new Gson();
        String json = gson.toJson(student);
        System.out.println("Json " + json);

	}

}
