package clases;

import java.util.ArrayList;



public class SistemaImp implements Sistema{
	private static SistemaImp instancia;
	public ArrayList<Proyecto> proyecto = new ArrayList<>();
	public ArrayList<Usuario> user = new ArrayList<>();
	public ArrayList<Tarea> tareas = new ArrayList<>();
	
	static  SistemaImp getInstancia() {
		   if (instancia == null) {
	            instancia = new SistemaImp();
	        }
	        return instancia;
	}
	
	public void agregarUsuario(Usuario u) {
		user.add(u);
	}
	public void agregarProyecto(Proyecto p) {
		proyecto.add(p);
		
	}
	
	public Proyecto getProyectoId(String id){
		for (Proyecto p : proyecto ) {
			if(p.getId().equals(id)) {
				return p;
			}
		}
		return null;
	}
	public void agregarTareaProyecto(String proyectoId,Tarea t ) {
		Proyecto p = getProyectoId(proyectoId);
		if(p != null) {
			p.agregarTarea(t);
		}
		tareas.add(t);
	}

	@Override
	public void aplicarVisitor() {
		
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
		for(Proyecto proyec:proyecto) {
			System.out.println(proyec);
			System.out.println(proyec.getTareas());
		
			}}
		
			

	@Override
	public void verProyecto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verTarea() {
		// TODO Auto-generated method stub
		
	}


	public Usuario acceder(String usuario,String password ) {
		for(Usuario u:user) {
			if(u.getUser().equals(usuario) && u.getPassword().equals(password)) {
				return u;
			}
		}
		return null;
	}
	

}
