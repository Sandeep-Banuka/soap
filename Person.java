package soappackage;

import java.util.ArrayList;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface Person {
	void createPerson(int pId,String name);
	void deletePerson(int pId);
	void updatePerson(int pId,String name);
	String retrievePerson(int pId);
	ArrayList<Persons> getAll();
}

