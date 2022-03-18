package com.example.dbmigrationflyway.Cafe.controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.dbmigrationflyway.Cafe.entity.Customers;
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
public class CustomerControllerTest {

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
    public void testAddCustomer() throws Exception {
        Customers customers = new Customers(1L, "Gunduz", "Dogru", "996706177535", "Bishkek");
        String jsonRequest = mapper.writeValueAsString(customers);

        MvcResult result = mockMvc
                .perform(post("/customers/add").content(jsonRequest).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200, result.getResponse().getStatus());

    }

    @WithMockUser(username = "asel", roles = {"ADMIN"})
    @Test
    public void testGetAllCustomers() throws Exception {
        MvcResult result = mockMvc.perform(get("/customers").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200, result.getResponse().getStatus());

    }

    @WithMockUser(username = "asel", roles = {"ADMIN"})
    @Test
    public void testGetOneCustomer() throws  Exception{
        MvcResult result = mockMvc.perform(get("/customers/1").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200, result.getResponse().getStatus());
    }

    @WithMockUser(username = "asel", roles = {"ADMIN"})
    @Test
    public void testUpdateCustomer() throws Exception{
        Customers customer = new Customers(2L,"Mehmet","Ozyilmaz","+96475032455","Sulaimaniyah");
        String jsonRequest = mapper.writeValueAsString(customer);

        MvcResult result = mockMvc.perform(put("/customers/update/1").content(jsonRequest).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200,result.getResponse().getStatus());
    }

//    @WithMockUser(username = "asel", roles = {"ADMIN"})
//    @Test
//    public void deleteCustomerTest() throws  Exception{
//        this.mockMvc.perform(delete("/customers/delete/1"))
//                .andDo(print())
//                .andExpect(status().isOk());
//    }
}