package clases;

import java.util.ArrayList;



public class SistemaImp implements Sistema{
	private static SistemaImp instancia;
	public ArrayList<Proyecto> proyecto = new ArrayList<>();
	public ArrayList<Usuario> user = new ArrayList<>();
	public ArrayList<Tarea> tareas = new ArrayList<>();
	public  SistemaImp getInstancia() {
		   if (instancia == null) {
	            instancia = new SistemaImp();
	        }
	        return instancia;
	}

	@Override
	public void aplicarVisitor() {
		// TODO Auto-generated method stub
		
	}

	public void actualizarTarea() {
		// TODO Auto-generated method stub
		
	}

	void verTareas() {
		// TODO Auto-generated method stub
		
	}
	public void verProyectos() {
		// TODO Auto-generated method stub
		
	}

	

	public void generarReporte() {
		// TODO Auto-generated method stub
		
	}

	public void modificarTarea() {
		// TODO Auto-generated method stub
		
	}

	public void modificarProyecti() {
		// TODO Auto-generated method stub
		
	}

	public void verListaCompleta() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verProyecto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verTarea() {
		// TODO Auto-generated method stub
		
	}
	

}
