package clases;


import patrones.Visitor;

public interface Sistema {
	void verProyecto();
	void verTarea();
	void actualizarTarea();
	void aplicarVisitor();
	void generarReporte();

	void aplicarVisitorAUsuario(String usuario, Visitor visitor);
	

}
