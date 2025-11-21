package patrones;

import clases.TareaBug;
import clases.TareaDocumentacion;
import clases.TareaFeature;

public class ExportVisitor implements Visitor {

	@Override
	public void aceptar(TareaDocumentacion documento) {
		System.out.println("mejora la calidad del proyecto");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aceptar(TareaFeature feature) {
		System.out.println("Impacto en la estimacion del tiempo ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aceptar(TareaBug bug) {
		System.out.println("afecta la criticidad del proyecto");
		// TODO Auto-generated method stub
		
	}

}
