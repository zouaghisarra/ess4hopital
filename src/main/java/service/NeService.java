package service;

import javax.jws.WebService;

import model.NouveauNe;
import repository.NoveauNeRep;

@WebService(targetNamespace = "http://service/", portName = "NeServicePort", serviceName = "NeServiceService")
public class NeService implements INe {
	private NoveauNeRep rep= new NoveauNeRep();

	@Override
	public NouveauNe chercher(String id) {
		// TODO Auto-generated method stub
		return rep.find(id);
	}

}
