package uk.co.tpplc.springexamples.container;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaWiredCarConfig {

	@Bean
	public Driver murdock(){
		Driver murdock = new Murdock();
		murdock.setQuote("Bosco all these buttons are confusing me!");
		return murdock;
	}
	
	@Bean
	public Engine v8(){
		return new V8Petrol();
	}
	
	@Bean
	public Car car(){
		Car car = new Car("ford");
		car.setDriver(murdock());
		car.setEngine(v8());
		return car;
	}
}
