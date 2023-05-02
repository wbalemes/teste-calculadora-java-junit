package calculadoraaritmeticateste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadoraaritimetica.Metodos;


class CalculadorAaritmeticaTeste {
	int n1 = 12;
	int n2 = 12;	
	int resultado = 0;
	
	@Test
	void testAritmetica() {
		Metodos arit = new Metodos();
		resultado = arit.aritmetica(n1, n2);		
		assertEquals(12, resultado);
	}

}
