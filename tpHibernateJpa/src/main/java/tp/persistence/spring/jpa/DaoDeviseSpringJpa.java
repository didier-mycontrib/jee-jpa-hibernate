
package tp.persistence.spring.jpa;

import java.util.List;

import javax.inject.Named;

import org.mycontrib.generic.persistence.GenericDaoJpaImpl;
import org.springframework.transaction.annotation.Transactional;

import tp.data.entity.Devise;
import tp.persistence.spring.dao.DaoDevise;

@Named
@Transactional
public class DaoDeviseSpringJpa extends GenericDaoJpaImpl<Devise,String> implements DaoDevise {

	
	@Override
	public Devise getDeviseByName(String deviseName) {
		return  this.entityManager
				.createQuery("select d from Devise d where d.monnaie = :deviseName",Devise.class)
				.setParameter("deviseName",deviseName)
				.getSingleResult();
	}
	    //public List<_Devise> findDeviseByXyz(...){ .... }

	
	@Override
	public List<Devise> getAllDevise() {
		return  this.entityManager
				.createQuery("select d from Devise d",Devise.class).getResultList();
	}
}
