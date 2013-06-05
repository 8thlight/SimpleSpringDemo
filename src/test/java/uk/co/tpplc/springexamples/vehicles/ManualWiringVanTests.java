package uk.co.tpplc.springexamples.vehicles;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import uk.co.tpplc.springexamples.vehicles.Engine;
import uk.co.tpplc.springexamples.vehicles.Van;


public class ManualWiringVanTests {

	private Van van;

	private Engine v8;

	private Engine diesel;

	@Before
	public void setup() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"/uk/co/tpplc/springexamples/vehicles/ManualVanTests-context.xml");

		van = (Van) ctx.getBean("van");
		v8 = (Engine) ctx.getBean("v8");
		diesel = (Engine) ctx.getBean("diesel");
	}

	@Test
	public void seeIfCarIsWiredUp() {

		System.out.println(van.start());
		assertEquals("chevrolet", van.getMake());
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
