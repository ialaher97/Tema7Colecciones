package interfaces;

public interface GestionTaller {
	boolean hayHueco(String tipoAutomovil);
	<T> boolean entradaParaReparar(T a);
	boolean automovilReparado(String matricula);
}
