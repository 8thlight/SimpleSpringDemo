package uk.co.tpplc.springexamples.container;

public class Car {
	
	final String make;
	
	public Car(String make){
		this.make = make;
	}
		
	protected Driver driver;
	
	protected Engine engine;

	public String getMake(){
		return make;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public String start(){
		StringBuffer buf = new StringBuffer();
		buf.append(driver.turnKey());
		buf.append(" ");
		buf.append(engine.start());
		
		return buf.toString();
	}
	
}
