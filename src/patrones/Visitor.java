package patrones;

import clases.TareaBug;
import clases.TareaDocumentacion;
import clases.TareaFeature;

public interface Visitor {
	
	void aceptarDocumentacion(TareaDocumentacion documento);
	void aceptarFeature(TareaFeature feature);
	void aceptarBug(TareaBug bug);

}
