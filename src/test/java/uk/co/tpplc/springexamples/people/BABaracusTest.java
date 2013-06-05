package uk.co.tpplc.springexamples.people;

import static org.junit.Assert.*;

import org.junit.Test;


public class BABaracusTest {
	
	@Test
	public void baQuotesWhenStartingEngine(){
		BABaracus ba = new BABaracus();
		ba.setQuote("Hey Murdock, be quiet");
		
		assertEquals("Hey Murdock, be quiet - fool!", ba.turnKey());
	}
	
	@Test
	public void baKnowsHisOwnName(){
		BABaracus ba = new BABaracus();
		assertEquals("BABaracus", ba.getName());
	}
	
	@Test
	public void baQuotesAccurately(){
		BABaracus ba = new BABaracus();
		ba.setQuote("Out, out damn spot! <Lady Macbeth>");
		assertEquals("Out, out damn spot! <Lady Macbeth> - fool!", ba.getQuote());
	}

}
