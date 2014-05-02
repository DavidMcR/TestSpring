package dto;

public class Item {

	private String title;
	private String itemName;
	private String comment1;
	private String userID;
	private String type;
	
	public String getUserID() {
		return userID;
	}

	public String getTitle() {
		return title;
	}

	public String getItemName() {
		return itemName;
	}

	public String getComment1() {
		return comment1;
	}

	public void setUserID(String userID) {
		this.userID=userID;
		
	}

	public void setTitle(String title) {
	this.title=title;
		
	}

	public void setItemName(String itemName) {
		this.itemName=itemName;
		
	}

	public void setComment1(String comment1) {
		this.comment1=comment1;
		
	}

	public String getType() {
	
		return type;
	}

	public void setType(String type) {
		this.type=type;
		
	}

}
