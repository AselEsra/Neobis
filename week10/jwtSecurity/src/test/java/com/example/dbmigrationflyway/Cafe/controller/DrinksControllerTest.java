package com.example.dbmigrationflyway.Cafe.controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.dbmigrationflyway.Cafe.entity.Drinks;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class DrinksControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @Autowired
    private ObjectMapper mapper;


    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).apply(springSecurity()).build();
    }

    @WithMockUser(username = "asel", roles = {"ADMIN"})
    @Test
    public void testAddDrink() throws Exception {
        Drinks drink = new Drinks(1L, "Latte", false, true, 2.50);
        String jsonRequest = mapper.writeValueAsString(drink);

        MvcResult result = mockMvc
                .perform(post("/drinks/add").content(jsonRequest).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200, result.getResponse().getStatus());

    }

    @WithMockUser(username = "asel", roles = {"ADMIN"})
    @Test
    public void testGetAllDrinks() throws Exception {
        MvcResult result = mockMvc.perform(get("/drinks").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200, result.getResponse().getStatus());

    }

    @WithMockUser(username = "asel", roles = {"ADMIN"})
    @Test
    public void testGetOneDrink() throws  Exception{
        MvcResult result = mockMvc.perform(get("/drinks/1").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200, result.getResponse().getStatus());
    }

    @WithMockUser(username = "asel", roles = {"ADMIN"})
    @Test
    public void testUpdateDrink() throws Exception{
        Drinks drink = new Drinks(2L,"Lemonade",true,false,2.30);
        String jsonRequest = mapper.writeValueAsString(drink);

        MvcResult result = mockMvc.perform(put("/drinks/update/11").content(jsonRequest).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200,result.getResponse().getStatus());
    }
}