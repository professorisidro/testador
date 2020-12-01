package br.com.professorisidro.testador.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class WebTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void webTest1()  throws Exception{
		System.out.println(" ----- DEBUG --- WEB TEST");
		mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
		       .andExpect(MockMvcResultMatchers.status().isOk())
		       .andExpect(MockMvcResultMatchers.content().string("Hello"));
	}
}
