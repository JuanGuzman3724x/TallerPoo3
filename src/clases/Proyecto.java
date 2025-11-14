package clases;

public class Proyecto {
	private String id;
	private String nombre;
	private String usuario;
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
	@Override
	public String toString() {
		return id + "," + nombre +", "+ usuario +"," ;
		
	}

}
