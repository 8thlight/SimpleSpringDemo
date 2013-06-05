package uk.co.tpplc.springexamples.vehicles;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import uk.co.tpplc.springexamples.vehicles.Van;

@ContextConfiguration(locations = { "/uk/co/tpplc/springexamples/vehicles/JavaWiredVanTests-context.xml" })
public class JavaWiredVanTests extends AbstractJUnit4SpringContextTests {
	
	@Test
	public void seeIfTheContextHasBeansIn(){
		Van van = (Van)applicationContext.getBean("van");
		System.out.println("Yay for Java wiring - " + van.start());
		assertEquals("ford", van.getMake());
	}
}
