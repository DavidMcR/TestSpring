package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dto.Item;

public class testItem {

	@Test
	public void test() {
		String userID="01";
		String title="title of item";
		String itemName="name of item";
		String type="blog";
		String comment1="hello this is one blog";
		Item item = new Item();
		item.setUserID(userID);
		item.setTitle(title);
		item.setItemName(itemName);
		item.setType(type);
		item.setComment1("hello this is one blog");
		
		String returnedUserID = item.getUserID();
		String returnedTitle = item.getTitle();
		String returnedType = item.getType();
		String returnedItemName = item.getItemName();
		String returnedComment1 = item.getComment1();
		String[] returned={returnedUserID,returnedTitle,returnedItemName,returnedType,returnedComment1};
		String[] expected={userID,title,itemName,type,comment1};
		assertArrayEquals(expected,returned);

	}

}
