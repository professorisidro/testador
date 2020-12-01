package br.com.professorisidro.testador.unit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.professorisidro.testador.model.Cliente;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SimpleTests {
	
	@Test
	public void simpleTester() {
		System.out.println("---- criando cliente!!! ");
		assertTrue(new Cliente() != null);
	}
}
