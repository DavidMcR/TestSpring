package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import dto.ActiveItems;
import dto.Blog;
import dto.Blog1;
import dto.BlogList;
import dto.CreateBlogDTO;
import dto.Item;
import dto.ItemList;
import dto.TableList;
import dto.User;
import dto.UserList;

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
	@Test 
	public void testActiveItems(){
		String type ="item";
		String itemName="name of item";
		
		ActiveItems activeItems = new ActiveItems();

		 
		 activeItems.setType(type);
		 activeItems.setItemName(itemName);
		 
		 String returnedType=activeItems.getType();
		 String returnedItemName=activeItems.getItemName();
			String[] returned={returnedType, returnedItemName};
			String[] expected={type, itemName};
			assertArrayEquals(expected, returned);
	}
	@Test
	public void testBlog1(){
		int aKey=01;
		String thingString="words";
		Date insertDate=new Date("2013/06/01");
		String userID="";
		String title="";

		Blog1 blog = new Blog1();
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
	public void testBlogList(){
		BlogList bList = new BlogList();
		DTOcreator dtoc = new DTOcreator();
		Blog blog = dtoc.createBlog();
		
		List<Blog> listBlog = new ArrayList<Blog>();
		listBlog.add(blog);
		bList.setList(listBlog);
		List<Blog> returnBList = bList.getList();
		assert(returnBList.equals(listBlog));
		
		
	}
	@Test
	public void testItemList(){
		ItemList iList = new ItemList();
		DTOcreator dtoc = new DTOcreator();
		Item item = dtoc.createItem();
		
		List<Item> listitem = new ArrayList<Item>();
		listitem.add(item);
		iList.setList(listitem);
		List<Item> returnBList = iList.getList();
		assert(returnBList.equals(listitem));
		
		
	}  
	@Test
	public void testUserList(){
		UserList uList = new UserList();
		DTOcreator dtoc = new DTOcreator();
		User user = dtoc.createUser();
		
		List<User> listUser = new ArrayList<User>();
		listUser.add(user);
		uList.setList(listUser);
		List<User> returnUList = uList.getList();
		assert(returnUList.equals(listUser));
		
		
	} 
	
	@Test
	public void testCreateBlogDTO(){
		String itemName="item name";
		String type="blog";
		
		CreateBlogDTO cbdto = new CreateBlogDTO();
		
		cbdto.setItemName(itemName);
		cbdto.setType(type);
		String returnedItemName=cbdto.getItemName();
		String returnedType=cbdto.getType();
		String[] expected={itemName,type };
		String[] recieved={returnedItemName, returnedType};
		assertArrayEquals(expected, recieved);
	
		
	}
	
	@Test
	public void testTableList(){
		int aKey=101;
		String tableName="table name";
		String itemName="item name";
		TableList tl = new TableList();
		tl.setAKey(aKey);
		tl.setTabelName(tableName);
		tl.setItemName(itemName);  
		int returnedAKey= tl.getAKey();
		String returnedTableName = tl.getTabelName();
		String returnedItemName = tl.getItemName();
		String[] expected={Integer.toString(aKey),itemName,tableName };
		String[] recieved={Integer.toString(returnedAKey), returnedItemName, returnedTableName};
		assertArrayEquals(expected, recieved);
	}
	
	
	
	

}
