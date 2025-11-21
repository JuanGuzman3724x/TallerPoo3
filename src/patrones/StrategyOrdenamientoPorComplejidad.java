package patrones;

import java.util.ArrayList;

import clases.Tarea;

public class StrategyOrdenamientoPorComplejidad implements Strategy{


	@Override
	public ArrayList<Tarea> ordenamiento(ArrayList<Tarea> tarea) {
		for (int i = 1; i < tarea.size(); i++) {
            Tarea aux = tarea.get(i);
            int valorAux = valor(aux.getComplejidad());

            int j = i - 1;

      +
            while (j >= 0 && valor(tarea.get(j).getComplejidad()) < valorAux) {
                tarea.set(j + 1, tarea.get(j));
                j--;
            }
            tarea.set(j + 1, aux);
        }

        return tarea;
    }

    private int valor(String c) {
        if (c == null) return 0;
        switch (c.toUpperCase()) {
            case "ALTA": return 3;
            case "MEDIA": return 2;
            case "BAJA": return 1;
            default: return 0;
        }
    }
	

}
