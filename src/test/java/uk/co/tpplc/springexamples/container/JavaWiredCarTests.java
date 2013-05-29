package uk.co.tpplc.springexamples.container;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = { "/uk/co/tpplc/springexamples/container/JavaWiredCarTests-context.xml" })
public class JavaWiredCarTests extends AbstractJUnit4SpringContextTests {
	
	@Test
	public void seeIfTheContextHasBeansIn(){
		Car car = (Car)applicationContext.getBean("car");
		System.out.println("Yay for Java wiring - " + car.start());
		assertEquals("ford", car.getMake());
	}
}
