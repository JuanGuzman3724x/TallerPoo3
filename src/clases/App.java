package clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import patrones.TareaFactory;


public class App {
	
	static Scanner scanner = new Scanner(System.in);
	static SistemaImp sistema =SistemaImp.getInstancia();
	
	public static void menu() {
		System.out.println("Bienvenido");
		System.out.println("usuario: ");
		String user = scanner.nextLine();
		System.out.println("Contraseña: ");
		String contra = scanner.nextLine();
		Usuario usuario = sistema.acceder(user,contra);
		if (usuario.getRol().equalsIgnoreCase("Administrador")) {
			menuAdmin(scanner);
		}
		else if(usuario.getRol().equals("Colaborador")) {
			menuUsuario(scanner);
		}
		
	}
	public static void lectorProyecto() throws FileNotFoundException {
		try (Scanner scan = new Scanner(new File("proyectos.txt"))) {
			while(scan.hasNextLine()) {
				String linea = scan.nextLine();
				String[] partes = linea.split("\\|");
				String id= partes[0];
				String nombre= partes[1];
				String usuario = partes[2];
				Proyecto proyecto = new Proyecto(id,nombre, usuario);
				sistema.agregarProyecto(proyecto);
			
			}
		}
		
	}
	public static void lectorUsuario() throws FileNotFoundException {
		try (Scanner scan = new Scanner(new File("usuarios.txt"))) {
			while(scan.hasNextLine()) {
				String linea = scan.nextLine();
				String[] partes = linea.split("\\|");
				String usuario = partes[0];
				String contrasena = partes[1];
				String rol = partes[2];
				Usuario user = new Usuario(usuario, contrasena, rol);
				sistema.agregarUsuario(user);
			}
		}
		
	}
	public static void lectorTareas() throws FileNotFoundException {
		try (Scanner scan = new Scanner(new File("tareas.txt"))) {
			while(scan.hasNextLine()) {
				String linea = scan.nextLine();
				String[] partes = linea.split("\\|");
				String idProjecto= partes[0];
				String id = partes[1];
				String tipo= partes[2];
				String descripcion = partes[3];
				String estado = partes[4];
				String responsable = partes[5];
				String complejidad = partes[6];
				String fecha= partes[7];
				Tarea tarea = TareaFactory.crearTarea(id, tipo, descripcion, estado, responsable, complejidad, fecha);
				Proyecto proyecto = sistema.getProyectoId(idProjecto);
				if(proyecto!= null) {
					
					sistema.agregarTareaProyecto(idProjecto, tarea);
				}
						
			}
		}
		
	}
	public static void menuUsuario(Scanner sc) {
		int opcion;
		do {
			System.out.println("Menu usuario:");
			System.out.println("1.ver proyectos disponibles:");
			System.out.println("2.Ver tareas asignadas:");
			System.out.println("3.Actualizr estado de una tarea:");
			System.out.println("4.Aplicar visitor a la tarea:");
			System.out.println("0.Salir");
			
			opcion =sc.nextInt();
			switch(opcion) {
			case 1:sistema.verListaCompleta();break;
			case 2:sistema.verTareas();break;
			case 3 :sistema.actualizarTarea();break;
			case 4:sistema.aplicarVisitor();break;
			
			}
		}while(opcion!=0);
		
		// TODO Auto-generated method stub
		
	}
	public static void menuAdmin(Scanner sc) {
		int opcion;
	do {
		System.out.println("Menu Admin:");
		System.out.println("1.ver lista completa de proyectos y tareas:");
		System.out.println("2.agregaro eliminar proyecto :");
		System.out.println("3.agregar o eliminar tarea en un proyecto:");
		System.out.println("4.Generar reporte de proyecto: ");
		System.out.println("0.Salir");
		
		opcion =sc.nextInt();
		switch(opcion) {
		case 1:sistema.verListaCompleta();
		break;
		case 2:sistema.modificarProyecti();break;
		case 3 :sistema.modificarTarea();break;
		case 4:sistema.generarReporte();break;
		
		}
	}while(opcion!=0);
	
	// TODO Auto-generated method stub
	

		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		lectorUsuario();
	   lectorProyecto();
		lectorTareas();
		
		
		menu();

	}

}
