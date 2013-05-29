package uk.co.tpplc.springexamples.container;

public class V8Petrol implements Engine {

	@Override
	public String start() {
		return "Rumble, cough, throaty roar";
	}

	@Override
	public String stop() {
		return "prrrrr";
	}

	@Override
	public String getType() {
		return "V8";
	}

}
