package repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.NouveauNe;

public class NoveauNeRep {
	private EntityManager em;

	public EntityManager getEm() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ess4hopital");
		em=emf.createEntityManager();
		return em;
	}
	public NouveauNe find(String id) {
		return getEm().find(NouveauNe.class, id);
	}

}
