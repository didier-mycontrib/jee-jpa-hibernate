
package tp.persistence.spring.jpa;

import java.util.List;

import javax.inject.Named;

import org.mycontrib.generic.persistence.GenericDaoJpaImpl;
import org.springframework.transaction.annotation.Transactional;

import tp.data.entity.Compte;
import tp.persistence.spring.dao.DaoCompte;

@Named
@Transactional
public class DaoCompteSpringJpa extends GenericDaoJpaImpl<Compte,Long> implements DaoCompte {


	@Override
	public List<Compte> getAllCompte() {
		return  this.entityManager
				.createQuery("select c from Compte c",Compte.class).getResultList();
	}
}
