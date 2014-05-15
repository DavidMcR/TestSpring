package dto;

import java.util.HashMap;
import java.util.List;

public class UserList {

	HashMap<String, String> userList = new HashMap<String, String>();

	public HashMap<String, String> getUserList() {
		return userList;
	}

	public void setUserList(List<User> listUser) {
		this.userList = (HashMap<String, String>) listUser;
	}


}