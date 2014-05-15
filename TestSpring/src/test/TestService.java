package test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import service.LoginService;
import service.NewBlogDAO;
import service.UserDAO;
import dto.User;

public class TestService {

	@Test
	public void testAddNewUser() {
		HashMap<String, String> users = new HashMap<String, String>();
		List uList;
		TestMethods tMeth = new TestMethods();
		User user = new User();
		TestMethods dtoc = new TestMethods();
		user = dtoc.createUser();
		
		UserDAO udao = new UserDAO();
		
		udao.addNewUser(user);
		uList =  tMeth.getUserList();
		User a = (User) uList.get((uList.size()-1));
		
		String expected[] = {user.getPassword(),user.getUserID(),user.getUserRole()};
		String recieved[] = {a.getPassword(),a.getUserID(),a.getUserRole()};
		assertArrayEquals(expected, recieved);
		dtoc.deleteLastEntry();
	}
	@Test
	public void testGetUserList(){
		HashMap<String, String> users = new HashMap<String, String>();
		List uList;
		TestMethods tMeth = new TestMethods();
		User user = new User();
		TestMethods dtoc = new TestMethods();
		user = dtoc.createUser();
		
		UserDAO udao = new UserDAO();
		
		udao.addNewUser(user);
		uList =  udao.getUserList();
		User a = (User) uList.get((uList.size()-1));
		assert(uList.size()>0);
		dtoc.deleteLastEntry();
		
	}
	
	@Test
	public void testSetUserBean(){
		LoginService ls =  new LoginService();
		String userName="user name";
		String password="password";
		String userId="userID";
		User u = ls.setUserBean(userName,password,userId);
		String expected[] = {password,userId,userName};
		String recieved[] = {u.getPassword(),u.getUserID(),u.getUserRole()};
		assertArrayEquals(expected, recieved);
	}
	@Test 
	public void testGetUserDetails(){
		LoginService ls =  new LoginService();
		User u = ls.getUserDetails();
		assert(u instanceof User);
		
	}
	
	@Test
	public void testAuthenticate(){
		LoginService ls =  new LoginService();
		TestMethods dtoc = new TestMethods();
		User u = new User();
		String testPassword="testpassword";
		String testName="testname";
		u.setPassword(testPassword);
		u.setUserID(testName);
		dtoc.addUserToDataBase(u);
		List userList = dtoc.getUserList();
		User returnedUser = (User) userList.get((userList.size()-1));
		boolean passwordCorrect=ls.authenticate(testName,testPassword);
		dtoc.deleteLastEntry();
		assert(passwordCorrect);		
		
	}
	@Test 
	public void testAddNewBlog(){
		NewBlogDAO newBlog = new NewBlogDAO();
		String name="blog name";
		newBlog.addNewBlog(name);
		TestMethods dtoc = new TestMethods();
		dtoc.getLastBlog();
		assertFalse("this is shite",true);
	}


}
