package dto;

import java.util.Date;

public class Blog1 {
	
	private int aKey;
	private String thingString;
	private Date insertDate;
	private String userID;
	private String title;

	public void setAKey(int aKey) {
		this.aKey=aKey;
		
	}

	public void setThingString(String thingString) {
		this.thingString=thingString;
		
	}

	public void setUserID(String userID) {
		this.userID=userID;
		
	}

	public void setTitle(String title) {
		this.title=title;
		
	}
	public void setInsterDate(Date insertDate) {
		this.insertDate=insertDate;
		
	}
	public int getAKey() {
		
		return aKey;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public String getUserID() {
		return userID;
	}

	public String getTitle() {
		return title;
	}

	public String getThingString() {
		return thingString;
	}

}
