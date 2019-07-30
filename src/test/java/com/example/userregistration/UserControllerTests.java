package com.example.userregistration;


import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.userregistration.controller.UserController;
import com.example.userregistration.domain.User;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTests {
	
	@Autowired
    private MockMvc mvc;
	
	
	@Test
	public void givenGetEmployees_ReturnJsonArray()
	  throws Exception {
	     
	    User kanwar = new User("Kanwar","Pannu","","","");
	   
	 
	    mvc.perform(get("/users")
	      .contentType(MediaType.APPLICATION_JSON))
	      .andExpect(status().isOk())
	      .andExpect(jsonPath("$[0].firstname", is(kanwar.getFirstName())));
	}



}
