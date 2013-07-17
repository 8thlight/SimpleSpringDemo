package uk.co.tpplc.springexamples.vehicles;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import uk.co.tpplc.springexamples.engines.Engine;
import uk.co.tpplc.springexamples.people.Driver;


public class ManualDtdWiringVanTests {

	private Van van;

	private Engine v8;

	private Engine diesel;

	private Driver murdock;

	@Before
	public void setup() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"/uk/co/tpplc/springexamples/vehicles/ManualVanTests-dtd-context.xml");

		van = (Van) ctx.getBean("van");
		v8 = (Engine) ctx.getBean("v8");
		diesel = (Engine) ctx.getBean("diesel");
		murdock = (Driver) ctx.getBean("murdock");
	}

	@Test
	public void seeIfCarIsWiredUp() {

		System.out.println(van.start());
		assertEquals("chevrolet", van.getMake());
		assertEquals(diesel, van.getEngine());
		assertEquals(murdock, van.getDriver());
	}

	@Test
	public void v8ShouldBeV8() {
		assertEquals("V8", v8.getType());
	}

	@Test
	public void flat4ShouldBeFlat4Diesel() {
		assertEquals("Flat4Diesel", diesel.getType());
	}
}
