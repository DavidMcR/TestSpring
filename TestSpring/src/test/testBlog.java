package test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import dto.Blog;

public class testBlog {

	@Test
	public void test() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
		String date = sdf.format(new Date()); 
		System.out.println(date);

		int aKey=01;
		String thingString="words";
		Date insertDate=new Date(date);
		String userID="";
		String title="";

		Blog blog = new Blog();
		blog.setAKey(aKey);
		blog.setThingString(thingString);
		blog.setUserID(userID);
		blog.setTitle(title);
		blog.setInsterDate(insertDate);
		
		int returnedAKey=blog.getAKey();
		System.out.println((sdf.format(blog.getInsertDate()).toString()));
		String returnedInsertDate=((sdf.format(blog.getInsertDate()).toString()));
		String returnedStringThing=blog.getStringThing();
		String returnedUserID=blog.getUserID();
		String returnedTitle=blog.getTitle();
		
		String[] expected={Integer.toString(aKey),thingString,userID,title,date.toString()};
		String[] gotBack={Integer.toBinaryString(returnedAKey),returnedStringThing,returnedUserID,returnedTitle,returnedInsertDate};
		assertArrayEquals(expected,gotBack);
		
	}

}
