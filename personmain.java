package soappackage;

import java.util.ArrayList;

import javax.xml.ws.Endpoint;

public class personmain {
	static ArrayList<Persons> personlist=new ArrayList<>();
	public static void main(String args[]) {


Endpoint.publish("http://localhost:9999/ws/hello",new PersonImplement());
}
}
