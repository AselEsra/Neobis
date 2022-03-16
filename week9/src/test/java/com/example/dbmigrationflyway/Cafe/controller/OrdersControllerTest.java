package com.example.dbmigrationflyway.Cafe.controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import com.example.dbmigrationflyway.Cafe.entity.Cakes;
import com.example.dbmigrationflyway.Cafe.entity.Customers;
import com.example.dbmigrationflyway.Cafe.entity.Drinks;
import com.example.dbmigrationflyway.Cafe.entity.Orders;
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

import java.time.LocalDateTime;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class OrdersControllerTest {

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
    public void testGetAllOrders() throws Exception {
        MvcResult result = mockMvc.perform(get("/orders").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200, result.getResponse().getStatus());

    }

    @WithMockUser(username = "asel", roles = {"ADMIN"})
    @Test
    public void testGetOneOrder() throws  Exception{
        MvcResult result = mockMvc.perform(get("/orders/1").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200, result.getResponse().getStatus());
    }

//    @WithMockUser(username = "asel", roles = {"ADMIN"})
//    @Test
//    public void testAddOrder() throws Exception {
//        Orders order = new Orders();
//        order.setCustomerId(new Customers(1L,"Gunduz", "Dogru", "996706177535", "Bishkek"));
//        order.setCakeId(new Cakes(5L,"Tiramisu","Coffee","Cacao",4.50));
//        order.setDrinkId( new Drinks(1L,"Lemonade",true,false,2.50));
//        String jsonRequest = mapper.writeValueAsString(order);
//
//        MvcResult result = mockMvc
//                .perform(post("/orders/add").content(jsonRequest).contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk()).andReturn();
//
//        assertEquals(200, result.getResponse().getStatus());
//
//    }
}