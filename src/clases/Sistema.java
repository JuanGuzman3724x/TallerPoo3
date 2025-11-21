package clases;


import java.io.IOException;

import patrones.Visitor;

public interface Sistema {
	void verProyecto();
	void verTarea();
	void actualizarTarea();
	void aplicarVisitor();
	void generarReporte(String filename)throws IOException ;

	void aplicarVisitorAUsuario(String usuario, Visitor visitor);
	

}
