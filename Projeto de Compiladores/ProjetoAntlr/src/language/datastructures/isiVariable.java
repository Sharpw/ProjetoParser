package language.datastructures;

public class isiVariable extends isiSymbol {
	
	public static final int NUMBER   	= 0;
	public static final int STRING  	= 1;
	public static final int OPERATION   = 2;
	public static final int OP_REL      = 3;
	public static final int ASSIGNMENT  = 4;
	public static final int SEMICOLON   = 5;
	
	private int type;
	private String value;
	
	public isiVariable(String name, int type,String value) {
		super(name);
		this.type = type;
		this.value = value;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "TIPO: " + type + ", VALOR: " + value + ", NOME: " + name;
	}
	
}
