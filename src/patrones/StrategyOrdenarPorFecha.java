package patrones;

import java.util.ArrayList;

import clases.Tarea;

public class StrategyOrdenarPorFecha implements Strategy {

	

	@Override
	public ArrayList<Tarea> ordenamiento(ArrayList<Tarea> tarea) {
		for (int i = 1; i < tarea.size(); i++) {
			Tarea aux = tarea.get(i);
			String fechaAux = aux.getFecha();
			int j = i - 1;
			while (j >= 0 && tarea.get(j).getFecha().compareTo(fechaAux) > 0) {
			tarea.set(j + 1, tarea.get(j));
			j--;
			}
			tarea.set(j + 1, aux);
			}
			return tarea;
			}
	}


