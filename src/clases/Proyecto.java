package clases;

import java.util.ArrayList;

public class Proyecto {
	private String id;
	private String nombre;
	private String usuario;
	private ArrayList<Tarea> tareas = new ArrayList<>();
	public Proyecto(String id, String nombre, String usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.usuario = usuario;
	}
	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getUsuario() {
		return usuario;
	}
	
	public ArrayList<Tarea> getTareas() {
		return tareas;
	}
	public void agregarTarea(Tarea t) {
		tareas.add(t);
	}
	public void eliminarTarea(Tarea t) {
		tareas.remove(t);
	}
	@Override
	public String toString() {
		return id + "," + nombre +", "+ usuario +"," ;
		
	}

}
