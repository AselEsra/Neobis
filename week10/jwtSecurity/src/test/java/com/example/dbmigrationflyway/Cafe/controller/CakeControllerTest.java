package com.example.dbmigrationflyway.Cafe.controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.dbmigrationflyway.Cafe.entity.Cakes;
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
public class CakeControllerTest {

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
    public void testAddCake() throws Exception {
        Cakes cake = new Cakes(1L, "Brownie", "Chocolate", "Chocolate", 5.00);
        String jsonRequest = mapper.writeValueAsString(cake);

        MvcResult result = mockMvc
                .perform(post("/cakes/add").content(jsonRequest).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200, result.getResponse().getStatus());

    }

    @WithMockUser(username = "asel", roles = {"ADMIN"})
    @Test
    public void testGetAllCakes() throws Exception {
        MvcResult result = mockMvc.perform(get("/cakes").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200, result.getResponse().getStatus());

    }

    @WithMockUser(username = "asel", roles = {"ADMIN"})
    @Test
    public void testGetOneCake() throws  Exception{
        MvcResult result = mockMvc.perform(get("/cakes/1").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200, result.getResponse().getStatus());
    }

    @WithMockUser(username = "asel", roles = {"ADMIN"})
    @Test
    public void testUpdateCake() throws Exception{
        Cakes cake = new Cakes(5L,"Tiramisu","Coffee","Cacao",4.50);
        String jsonRequest = mapper.writeValueAsString(cake);

        MvcResult result = mockMvc.perform(put("/cakes/update/5").content(jsonRequest).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200,result.getResponse().getStatus());
    }
}