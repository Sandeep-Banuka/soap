package soappackage;
import java.util.ArrayList;

import javax.jws.WebService;

@WebService(endpointInterface="soappackage.Person")

public class PersonImplement implements Person{
	//@Override
	public void createPerson(int pId,String name) {
		Persons p=new Persons();
		p.setpId(pId);
		p.setName(name);
		personmain.personlist.add(p);
	}
	
	public void deletePerson(int pId) {
		for(int i=0;i<personmain.personlist.size();i++) {
			if((personmain.personlist.get(i).getpId())==(pId)) {
				personmain.personlist.remove(i);
			}
		}
	}
	public void updatePerson(int pId,String name) {
		for(int i=0;i<personmain.personlist.size();i++) {
			if((personmain.personlist.get(i).getpId())==(pId)) {
				personmain.personlist.get(i).setName(name);
		}
}
	}
	public String retrievePerson(int pId) {
		for(int i=0;i<personmain.personlist.size();i++) {
			if((personmain.personlist.get(i).getpId())==(pId)) {
				return personmain.personlist.get(i).getName();
			}
			
		
		}
		return null;
	}
	public ArrayList<Persons> getAll(){
		ArrayList<Persons>p=new ArrayList<>();
		for(int i=0;i<personmain.personlist.size();i++) {
			Persons pp=new Persons();
			pp=personmain.personlist.get(i);
			p.add(pp);
			}
		return p;
		
	}
}
	
