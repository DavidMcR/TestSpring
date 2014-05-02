package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import dto.Blog;

public class testBlog {

	@Test
	public void test() {

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
		
		int returnedAKey=blog.getAKey();
		Date returnedInsertDate=blog.getInsertDate();
		String returnedUserID=blog.getUserID();
		String returnedTitle=blog.getTitle();
		
		fail("Not yet implemented");
	}

}
