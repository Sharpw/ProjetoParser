package language.datastructures;

import java.util.HashMap;

public class isiSymbolTable{
	
	private HashMap<String, isiSymbol> map;
	
	public isiSymbolTable(){
		map = new HashMap<String, isiSymbol>();
	}
	
	public void add(isiSymbol symbol){
		map.put(symbol.getName(), symbol);
	}
	
	public boolean exists(String symbolName){
		return map.get(symbolName) != null;
	}
	
	public isiSymbol get(String symbolName){
		return map.get(symbolName);
	}

}
