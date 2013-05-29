package uk.co.tpplc.springexamples.container;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ManualWiringCarTests {

	private Car car;

	private Engine v8;

	private Engine diesel;

	@Before
	public void setup() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"/uk/co/tpplc/springexamples/container/ManualCarTests-context.xml");

		car = (Car) ctx.getBean("car");
		v8 = (Engine) ctx.getBean("v8");
		diesel = (Engine) ctx.getBean("diesel");
	}

	@Test
	public void seeIfCarIsWiredUp() {

		System.out.println(car.start());
		assertEquals("chevrolet", car.getMake());
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
