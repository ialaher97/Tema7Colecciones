package Examen3;

import java.util.List;

public class Palabra {
	private String palabraOrigen;
	private String palabraTraducida;
	public String getPalabraOrigen() {
		return palabraOrigen;
	}
	public void setPalabraOrigen(String palabraOrigen) {
		this.palabraOrigen = palabraOrigen;
	}
	public String getPalabraTraducida() {
		return palabraTraducida;
	}
	public void setPalabraTraducida(String palabraTraducida) {
		this.palabraTraducida = palabraTraducida;
	}
	public Palabra(String palabraOrigen, String palabraTraducida) {
		super();
		this.palabraOrigen = palabraOrigen;
		this.palabraTraducida = palabraTraducida;
	}
	public Palabra() {
		super();
	}
	@Override
	public String toString() {
		return "Palabra [palabraOrigen=" + palabraOrigen + ", palabraTraducida=" + palabraTraducida + "]";
	}
	
	
	
	
	

}
