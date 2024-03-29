package test;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import dto.Blog;
import dto.Blog1;
import dto.Item;
import dto.User;

public class TestMethods {
	public Blog createBlog(){
		int aKey=02;
		String thingString="words";
		Date insertDate=new Date("2013/06/01");
		String userID="";
		String title="";

		Blog blog = new Blog();
		blog.setAKey(aKey);
		blog.setThingString(thingString);
		blog.setUserID(userID);
		blog.setTitle(title);
		blog.setInsterDate(insertDate);
		return blog;
	}
	
	public Item createItem(){
		String userID="02";
		String title="title of item";
		String itemName="name of item";
		String type="blog";
		String comment1="hello this is one blog";
		Item item = new Item();
		item.setUserID(userID);
		item.setTitle(title);
		item.setItemName(itemName);
		item.setType(type);
		item.setComment1("hello this is one blog");
		return item;
	}

	public User createUser() {
		int aKey=05;
		String userID="A User";
		String password="password";
		String userRole="user";
		User user = new User();
		
		//user.setAKey(aKey);
		user.setUserID(userID);
		user.setPassword(password);
		user.setUserRole(userRole);
		return user;
	}
	
	public List getUserList(){
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

   	    String name = (users.get(0)).getUserRole();
		
		return users;
	}
	public boolean deleteLastEntry(){
		User u = new User();
		List<User> users; 
		boolean deleteWorked = false;
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
		
		 int lastIndex = users.size();
		 u = users.get(lastIndex-1);
		 session.delete(u);
			session.getTransaction().commit();		
			session.close();
		return deleteWorked;
	}

	public void addUserToDataBase(User us) {
		 User u = new User();
		 u = us; 
		u.setPassword(us.getPassword());
		u.setUserID(us.getUserID());
		u.setUserRole(us.getUserRole());
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

	public void getLastBlog() {
		// TODO Auto-generated method stub
		
	}

}
