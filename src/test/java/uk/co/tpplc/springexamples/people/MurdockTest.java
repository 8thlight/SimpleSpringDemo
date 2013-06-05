package uk.co.tpplc.springexamples.people;

import static org.junit.Assert.*;

import org.junit.Test;


public class MurdockTest {
	
	@Test
	public void murdockMakesRemarkableQuote(){
		assertEquals("The C-130 versus the Mercedes Benz!", new Murdock().getQuote());
	}

}
