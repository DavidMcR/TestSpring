package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="USER_DETAILS")
public class User {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aKey;
	private String userID;
	private String password;
	private String userRole;


	public void setUserID(String userID) {
		this.userID=userID;
		
	}

	public void setAKey(int aKey) {
		this.aKey=aKey;
		
	}

	public void setPassword(String password) {
		this.password=password;
		
	}

	public void setUserRole(String userRole) {
		this.userRole=userRole;
		
	}

	public int getAKey() {
		return aKey;
	}

	public String getUserID() {
		return userID;
	}

	public String getPassword() {
		return password;
	}

	public String getUserRole() {
		return userRole;
	}

}
