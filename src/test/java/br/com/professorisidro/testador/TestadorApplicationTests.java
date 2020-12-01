package br.com.professorisidro.testador;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestadorApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(" [ TEST ] - CONTEXT LOADER CREATED");
	}
	
	@Test
	void secondTest() {
		System.out.println(" [ TEST ] - SEGUNDO TESTE");
	}
	

}
