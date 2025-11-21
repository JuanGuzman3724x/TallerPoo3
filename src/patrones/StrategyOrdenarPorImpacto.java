package patrones;

import java.util.ArrayList;

import clases.Tarea;

public class StrategyOrdenarPorImpacto implements Strategy {

	@Override
	public ArrayList<Tarea> ordenamiento(ArrayList<Tarea> tarea) {
		for (int i = 0; i < tarea.size();i++) {
			 int maxIdx = i;
	            for (int j = i + 1; j < tarea.size(); j++) {
	                Tarea a = tarea.get(j);
	                Tarea b = tarea.get(maxIdx);
	                int ia = impacto(a.getTipo());
	                int ib = impacto(b.getTipo());
	                if (ia > ib) {
	                    maxIdx = j;
	                } else if (ia == ib) {
	                    String fa = a.getFecha();
	                    String fb = b.getFecha();
	                    if (fa != null && fb != null) {
	                        if (fa.compareTo(fb) < 0) { 
	                            maxIdx = j;
	                        }
	                    }
	                }
	            }
	            if (maxIdx != i) {
	                Tarea tmp = tarea.get(i);
	                tarea.set(i, tarea.get(maxIdx));
	                tarea.set(maxIdx, tmp);
	            }
	        }
	        return tarea;
	    }
	
	private int impacto(String tipo) {
		if (tipo == null) {
			
		}
		switch(tipo.toLowerCase()) {
		case "bug":
			return 3;
		case "feature":
			return  2;
		case "documentacion":
			return 1;
		}
		
		
		return 0;
		
	}



}
