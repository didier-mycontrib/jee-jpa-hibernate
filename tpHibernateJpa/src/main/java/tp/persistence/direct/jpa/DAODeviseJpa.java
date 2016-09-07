package tp.persistence.direct.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import tp.data.entity.Devise;
import tp.data.entity.Pays;
import tp.persistence.direct.dao.DAODevise;
import tp.persistence.direct.dao.DAOJpa;

public class DAODeviseJpa implements DAODevise , DAOJpa{
	
	protected EntityManager entityManager;
	
	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager=entityManager;
	}

	@Override
	public void deleteDevise(String codeDevise) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeDevise(Devise dev) {
		// TODO Auto-generated method stub

	}

	@Override
	public Devise updateDevise(Devise dev) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Devise getDeviseByCode(String codeDevise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Devise persistNewDevise(Devise dev) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Devise getDeviseByName(String deviseName) {
		return  this.entityManager
				.createQuery("select d from Devise d where d.monnaie = :deviseName",Devise.class)
				.setParameter("deviseName",deviseName)
				.getSingleResult();
	}

	@Override
	public List<Devise> getAllDevise() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pays> getListePaysPartageantDevise(String codeDevise) {
		return  this.entityManager
				.createQuery("select p from Pays p inner join p.devise d where d.codeDevise = :codeDevise",Pays.class)
				.setParameter("codeDevise",codeDevise)
				.getResultList();

	}

	

}
