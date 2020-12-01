package br.com.professorisidro.testador.unit;

import static org.junit.jupiter.api.Assertions.assertTrue;	
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import br.com.professorisidro.testador.model.Cliente;

@SpringBootTest
public class SimpleTests {
	
	@Test
	public void simpleTester() {
		System.out.println("---- criando cliente!!! ");
		assertTrue(new Cliente() != null);
	}
}
