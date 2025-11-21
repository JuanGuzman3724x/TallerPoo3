package clases;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



import patrones.Visitor;




public class SistemaImp implements Sistema{
	private static SistemaImp instancia;
	public ArrayList<Proyecto> proyecto = new ArrayList<>();
	public ArrayList<Usuario> user = new ArrayList<>();
	public ArrayList<Tarea> tareas = new ArrayList<>();
	/**
	 * singleton
	 * @return
	 */
	static  SistemaImp getInstancia() {
		   if (instancia == null) {
	            instancia = new SistemaImp();
	        }
	        return instancia;
	}
	/**
	 * agrega usuario
	 * @param u
	 */
	public void agregarUsuario(Usuario u) {
		user.add(u);
	}
	/**
	 * agrega proyecto
	 * @param p
	 */
	public void agregarProyecto(Proyecto p) {
		proyecto.add(p);
		
	}
	/**busca el id del proyecto
	 * 
	 * @param id
	 * @return
	 */
	public Proyecto getProyectoId(String id){
		for (Proyecto p : proyecto ) {
			if(p.getId().equals(id)) {
				return p;
			}
		}
		return null;
	}
	/** agrega las tareas al projecto
	 * 
	 * @param proyectoId
	 * @param t
	 */
	public void agregarTareaProyecto(String proyectoId,Tarea t ) {
		Proyecto p = getProyectoId(proyectoId);
		if(p != null) {
			p.agregarTarea(t);
		}
		tareas.add(t);
	}


	void verTareas() {
		// TODO Auto-generated method stub
		
	}
	public void verProyectos() {
	
		// TODO Auto-generated method stub
		
	}

	
/**
 * Genera  el reporte 
 * @param filename
 * 
 */
	public void generarReporte(String filename){
	    try (FileWriter fw = new FileWriter(filename)) {
			for (Proyecto p : proyecto) {
	            fw.write("Proyecto: " + p.getId() + " - " + p.getNombre() + 
	                     " (Resp: " + p.getUsuario() + ")\n");
	            for (Tarea t : p.getTareas()) {
                    fw.write("  " + t.getId() + " | " + t.getTipo() + " | " + 
                             t.getEstado() + " | " + t.getResponsable() + " | " + 
                             t.getComplejidad() + " | " + t.getFecha() + "\n");
                }


	       
	                	            }
	            fw.write("\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void modificarTarea() {

	}

	public void modificarProyecti() {

	}
/**
 * Mustra la lista completa
 */
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
	public boolean crearProyecto(String id, String nombre, String responsable) {
        if (id == null || id.trim().isEmpty()) return false;
        if (getProyectoId(id) != null) return false;
        Proyecto p = new Proyecto(id, nombre, responsable);
        proyecto.add(p);
        return true;
    }


    public boolean eliminarProyecto(String proyectoId) {
        Proyecto p = getProyectoId(proyectoId);
        if (p == null) return false;
        for (Tarea t:tareas) {
            if (p.getTareas().contains(t));
        }
        proyecto.remove(p);
        return true;
    }



	public Usuario acceder(String usuario,String password ) {
		for(Usuario u:user) {
			if(u.getUser().equals(usuario) && u.getPassword().equals(password)) {
				return u;
			}
		}
		return null;
	}

	@Override
	public void actualizarTarea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aplicarVisitor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aplicarVisitorAUsuario(String usuario, Visitor visitor) {
		// TODO Auto-generated method stub
		
	}
	

}
