package classes;


public enum CategoriaCnh {
   
	A ("A"),
	B ("B"),
	C ("C"),
	D ("D"),
	E ("E");
	
	private final String tipo;

	CategoriaCnh(String tipo) {
    this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return this.tipo;
	}
}
 
