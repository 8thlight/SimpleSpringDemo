package uk.co.tpplc.springexamples.vehicles;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uk.co.tpplc.springexamples.people.Driver;
import uk.co.tpplc.springexamples.vehicles.Van;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class AutowiredVanTests {

	@Autowired
	Van van;
	
	@Autowired
	Driver ba;

	@Test
	public void letsSeeIfOurCarIsWiredUp(){
		System.out.println("Autowired - " +van.start());
		assertEquals("gm", van.getMake());
		assertEquals("Murdock", van.getDriver().getName());
	}
	
	@Test
	public void getAQuoteFromBA(){
		System.out.println("BA, what do you think? " + ba.getQuote());
		assertEquals("BABaracus", ba.getName());
	}
}