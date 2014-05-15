package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="TABLE_LIST")
public class TableList {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	int aKey;
	String tableName="table name";
	String itemName="item name";
	public void setAKey(int aKey) {
		this.aKey=aKey;
		
	}

	public void setTabelName(String tableName) {
		this.tableName=tableName;
		
	}

	public void setItemName(String itemName) {
		this.itemName=itemName;
		
	}

	public int getAKey() {
		return aKey;
	}

	public String getTabelName() {
		return tableName;
	}

	public String getItemName() {
		return itemName;
	}

}
