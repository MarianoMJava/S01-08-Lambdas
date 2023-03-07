package s0108n1ejercicio6;

public class Cadena {
	
	String textoNum;
	
	public Cadena(String textoNum) {
		super();
		this.textoNum = textoNum;
	}

	public String getTextoNum() {
		return textoNum;
	}

	public void setTextoNum(String textoNum) {
		this.textoNum = textoNum;
	}

	@Override
	public String toString() {
		return "Cadena [textoNum=" + textoNum + "]";
	}

}
