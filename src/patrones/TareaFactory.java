package patrones;

import clases.Tarea;
import clases.TareaBug;
import clases.TareaDocumentacion;
import clases.TareaFeature;

public class TareaFactory {
	public static Tarea crearTarea(String id, String tipo, String descripcion, String estado, String responsable, String complejidad,
			String fecha) {
		switch(tipo.toLowerCase()) {
		case "bug":
			return new TareaBug(id, tipo, descripcion, estado, responsable, complejidad, fecha);
		case "documentacion":
			return new TareaDocumentacion(id, tipo, descripcion, estado, responsable, complejidad, fecha);
		case "feature":
			return new TareaFeature(id, tipo, descripcion, estado, responsable, complejidad, fecha);
		default:
			throw new IllegalArgumentException("tipo no valido" + tipo);
		}
		
		 
		
	}

}
