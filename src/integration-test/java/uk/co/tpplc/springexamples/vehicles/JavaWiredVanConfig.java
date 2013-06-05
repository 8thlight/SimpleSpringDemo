package uk.co.tpplc.springexamples.vehicles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import uk.co.tpplc.springexamples.engines.Engine;
import uk.co.tpplc.springexamples.engines.V8Petrol;
import uk.co.tpplc.springexamples.people.Driver;
import uk.co.tpplc.springexamples.people.Murdock;
import uk.co.tpplc.springexamples.vehicles.Van;

@Configuration
public class JavaWiredVanConfig {

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
	public Van van(){
		Van van = new Van("ford");
		van.setDriver(murdock());
		van.setEngine(v8());
		return van;
	}
}
