package service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import dto.User;

public class UserDAO {

	public void addNewUser(User user) {
		User u = new User();
		u=user;
		Configuration configuration = new Configuration();   
	    ServiceRegistry serviceRegistry;
	    configuration.configure(); 
	    serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();	
	    SessionFactory  sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();
		session.close();
		
		
	}

	public List getUserList() {
		User u = new User();
		List<User> users; 
		
		Configuration configuration = new Configuration();
   	    ServiceRegistry serviceRegistry;
   	    configuration.configure();
   	    serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();	
	    SessionFactory  sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		//*************************************************************
		Query query = session.createQuery("from USER_DETAILS");
		 users = (List<User>) query.list();
		//*************************************************************		
		session.getTransaction().commit();		
		session.close();

   	    
   	    return users;
	}

}
