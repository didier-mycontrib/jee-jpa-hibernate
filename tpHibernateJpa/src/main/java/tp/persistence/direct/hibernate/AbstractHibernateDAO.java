package tp.persistence.direct.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import tp.persistence.direct.dao.DAOHibernate;

public class AbstractHibernateDAO implements DAOHibernate{
	
	protected SessionFactory sessionFactory;

	@Override
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory=sf;
	}
	
	public Session currentSession(){
		//return sessionFactory.getCurrentSession();
		return sessionFactory.openSession();
	}

}
