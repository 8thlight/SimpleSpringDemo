package uk.co.tpplc.springexamples.people;



public class Murdock implements Driver {

	protected String quote = "The C-130 versus the Mercedes Benz!";;
	
	@Override
	public String turnKey() {
		return quote;
	}

	@Override
	public String getQuote() {
		return quote;
	}

	@Override
	public void setQuote(String value) {
		quote = value;
	}

	@Override
	public String getName() {
		return "Murdock";
	}

}
