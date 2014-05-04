package dto;

public class ActiveItems {
	private String type ="item";
	private String itemName="name of item";

	public void setType(String type) {
		this.type=type;
		
	}

	public void setItemName(String itemName) {
		this.itemName=itemName;
		
	}

	public String getType() {
		
		return type;
	}

	public String getItemName() {

		return itemName;
	}

}
