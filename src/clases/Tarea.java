package clases;
import patrones.Visitor;
public abstract class Tarea {
	protected String id;
	protected String tipo;
	protected String descripcion;
	protected String estado;
	protected String responsable;
	protected String complejidad;
	protected String fecha;
	public Tarea(String id, String tipo, String descripcion, String estado, String responsable, String complejidad,
			String fecha) {
		this.id = id;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.estado = estado;
		this.responsable = responsable;
		this.complejidad = complejidad;
		this.fecha = fecha;
	}
	public String getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public String getResponsable() {
		return responsable;
	}
	public String getComplejidad() {
		return complejidad;
	}
	public String getFecha() {
		return fecha;
	}
	public abstract void aceptar(Visitor visitar);
	@Override
	public String toString() {
		return "[" + tipo + "]" + id + ";" + descripcion + " ;"+ estado + ";" + responsable+ "," + fecha ;
	}
	
}
