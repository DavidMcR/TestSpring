package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import dto.Blog;
import dto.Item;
import dto.User;

public class TestDTOs {

	@Test
	public void testBlog() {

		int aKey=01;
		String thingString="words";
		Date insertDate=new Date("2013/06/01");
		String userID="";
		String title="";

		Blog blog = new Blog();
		blog.setAKey(aKey);
		blog.setThingString(thingString);
		blog.setUserID(userID);
		blog.setTitle(title);
		blog.setInsterDate(insertDate);
		
		String returnedAKey= Integer.toString(blog.getAKey());
		Date returnedInsertDate=blog.getInsertDate();
		String returntedThingString = blog.getThingString();
		String returnedUserID=blog.getUserID();
		String returnedTitle=blog.getTitle();
		
		String[] expected={Integer.toString(aKey),thingString,userID,title };
		String[] recieved={returnedAKey,returntedThingString, returnedUserID,returnedTitle};
		assertArrayEquals(expected, recieved);
	}
	
	@Test
	public void testItem() {
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
	@Test 
	public void testUser(){
		int aKey=01;
		String userID="A User";
		String password="password";
		String userRole="user";
		User user = new User();
		
		user.setAKey(aKey);
		user.setUserID(userID);
		user.setPassword(password);
		user.setUserRole(userRole);
		
		String returnedAKey = Integer.toString(user.getAKey());
		String returnedUserID  = user.getUserID();
		String returnedPassword = user.getPassword();
		String returnedUserRole = user.getUserRole();
		String[] returned={returnedUserID,returnedAKey,returnedPassword,returnedUserRole};
		String[] expected={userID,Integer.toString(aKey),password,userRole};
		assertArrayEquals(expected, returned);
	}

}
