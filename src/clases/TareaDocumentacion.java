package clases;

import patrones.Visitor;

public class TareaDocumentacion extends Tarea {

	public TareaDocumentacion(String id, String tipo, String descripcion, String estado, String responsable,
			String complejidad, String fecha) {
		super(id, tipo, descripcion, estado, responsable, complejidad, fecha);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aceptar(Visitor visitar) {
		visitar.aceptar(this);
		
	}
	

}
