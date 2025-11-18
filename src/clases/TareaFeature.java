package clases;

import patrones.Visitor;

public class TareaFeature extends Tarea{

	public TareaFeature(String id, String tipo, String descripcion, String estado, String responsable,
			String complejidad, String fecha) {
		super(id, tipo, descripcion, estado, responsable, complejidad, fecha);
	}

	@Override
	public void aceptar(Visitor visitar) {
		visitar.aceptar(this);
		
		
	}

}
