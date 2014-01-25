package br.com.edsonmartins.maven;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{    
    @Test
	public void deveQuebrarTresLinhas()
    {
    	// Original: 
    	// - Um pequeno jabuti xereta viu dez cegonhas felizes.    	
    	// Quebrado:
    	// - Um pequeno jabuti
    	// - xereta viu dez
    	// - cegonhas felizes.    	
    	QuebraDeLinha q = new QuebraDeLinha("Um pequeno jabuti xereta viu dez cegonhas felizes.", 20);
    	Assert.assertEquals("Um pequeno jabuti \nxereta viu dez \ncegonhas felizes.", q.quebrarLinha());
    }
    
    @Test 
    public void deveQuebrarDuasLinhas() {    	
    	QuebraDeLinha q = new QuebraDeLinha("Frase teste", 10);
    	Assert.assertEquals("Frase \nteste", q.quebrarLinha()); 
    }
    
    @Test 
    public void naoDeveQuebrarLinha() {    	
    	QuebraDeLinha q = new QuebraDeLinha("Frase test", 10);
    	Assert.assertEquals("Frase test", q.quebrarLinha()); 
    }
}
