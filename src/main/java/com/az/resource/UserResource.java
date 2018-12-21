package com.az.resource;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.az.entity.User;

@Path("/userResource")
public class UserResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("usetList")
	public List<User> getUserList(){
		User user1 = new User();
		user1.setUserId(Long.valueOf(1));
		user1.setName("Azhar");
		user1.setAge(30);
		User user2 = new User();
		user2.setUserId(Long.valueOf(2));
		user2.setName("Wasif");
		user2.setAge(27);
		User user3 = new User();
		user3.setUserId(Long.valueOf(3));
		user3.setName("Adil");
		user3.setAge(28);
		User user4 = new User();
		user4.setUserId(Long.valueOf(4));
		user4.setName("Adeel");
		user4.setAge(30);
		
		List<User> userList = Arrays.asList(user1,user2,user3,user4);
		
		return userList;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("usetList_JSON")
	public List<User> getUserListJSON(){
		User user1 = new User();
		user1.setUserId(Long.valueOf(1));
		user1.setName("Azhar");
		user1.setAge(30);
		User user2 = new User();		
		user2.setUserId(Long.valueOf(2));
		user2.setName("Wasif");
		user2.setAge(27);
		User user3 = new User();
		user3.setUserId(Long.valueOf(3));
		user3.setName("Adil");
		user3.setAge(28);
		User user4 = new User();
		user4.setUserId(Long.valueOf(4));
		user4.setName("Adeel");
		user4.setAge(30);
		
		List<User> userList = Arrays.asList(user1,user2,user3,user4);
		
		return userList;
	}
}
