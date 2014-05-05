package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import service.UserDAO;
import dto.User;
import dto.UserList;

public class TestService {

	@Test
	public void testAddNewUser() {
		
		UserList uList = new UserList();
		TestMethods tMeth = new TestMethods();
		User user = new User();
		TestMethods dtoc = new TestMethods();
		user = dtoc.createUser();
		
		UserDAO udao = new UserDAO();
		
		udao.addNewUser(user);
		System.out.println("hello ");
		uList = (UserList) tMeth.getUserList();
		System.out.println("hello 2");
		System.out.println("the ulist "+uList.toString());
		fail("Not yet implemented");
	}
	


}
