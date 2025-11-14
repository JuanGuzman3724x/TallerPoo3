package clases;

public class Tarea {
	private String id;
	private String tipo;
	private String descripcion;
	private String estado;
	private String responsable;
	private String complejidad;
	private String fecha;
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
	
}
