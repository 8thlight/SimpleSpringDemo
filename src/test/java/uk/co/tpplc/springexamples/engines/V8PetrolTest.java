package uk.co.tpplc.springexamples.engines;

import static org.junit.Assert.*;

import org.junit.Test;


public class V8PetrolTest {
	
	@Test
	public void seeIfV8StopsNicely(){
		assertEquals("prrrrr", new V8Petrol().stop());
	}

}
