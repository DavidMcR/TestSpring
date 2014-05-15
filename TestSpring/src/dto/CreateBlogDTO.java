package dto;

public class CreateBlogDTO {
	private String itemName;
	private String type;
	public void setItemName(String itemName) {
		this.itemName=itemName;
		
	}

	public void setType(String type) {
		this.type=type;
		
	}

	public String getItemName() {

		return itemName;
	}

	public String getType() {

		return type;
	}

}
