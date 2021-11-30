package language.datastructures;

public abstract class isiSymbol {
	
	protected String name;

	public isiSymbol(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "isiSymbol [name=" + name + "]";
	}
	
	

}
