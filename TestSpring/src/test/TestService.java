package test;

import static org.junit.Assert.*;

import org.junit.Test;

import service.UserDAO;
import dto.User;

public class TestService {

	@Test
	public void testAddNewUser() {
		User user = new User();
		DTOcreator dtoc = new DTOcreator();
		user = dtoc.createUser();
		
		UserDAO udao = new UserDAO();
		udao.addNewUser(user);
		fail("Not yet implemented");
	}

}
