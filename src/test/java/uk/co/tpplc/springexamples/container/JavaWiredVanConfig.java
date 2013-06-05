package uk.co.tpplc.springexamples.container;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
