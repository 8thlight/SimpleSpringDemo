package uk.co.tpplc.springexamples.engines;


public class Flat4Diesel implements Engine{

	@Override
	public String start() {
		return "Rrrrmmm bada bada bada bada...";
	}

	@Override
	public String stop() {
		return "clunk, lurch";
	}

	@Override
	public String getType() {
		return "Flat4Diesel";
	}

}
