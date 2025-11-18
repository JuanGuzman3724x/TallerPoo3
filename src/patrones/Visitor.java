package patrones;

import clases.TareaBug;
import clases.TareaDocumentacion;
import clases.TareaFeature;

public interface Visitor {
	
	
	void aceptar(TareaDocumentacion documento);
	void aceptar(TareaFeature feature);
	void aceptar(TareaBug bug);

}
