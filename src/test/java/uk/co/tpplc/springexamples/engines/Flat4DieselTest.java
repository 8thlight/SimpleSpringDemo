package uk.co.tpplc.springexamples.engines;

import static org.junit.Assert.*;

import org.junit.Test;


public class Flat4DieselTest {
	
	@Test
	public void seeIfEngineStops(){
		assertEquals("clunk, lurch", new Flat4Diesel().stop());
	}

}
