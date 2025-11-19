package clases;

import java.util.Scanner;

public class SistemaImp implements Sistema{
	private Scanner sc;

	@Override
	public void menuUsuario(Scanner sc) {
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
			case 1:verProyectos();break;
			case 2:verTareas();break;
			case 3 :actualizarTarea();break;
			case 4:aplicarVisitor();break;
			
			}
		}while(opcion!=0);
		
		// TODO Auto-generated method stub
		
	}

	public void aplicarVisitor() {
		// TODO Auto-generated method stub
		
	}

	public void actualizarTarea() {
		// TODO Auto-generated method stub
		
	}

	private void verTareas() {
		// TODO Auto-generated method stub
		
	}

	private void verProyectos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuAdmin(Scanner sc) {
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
			case 1:break;
			case 2:break;
			case 3 :break;
			case 4:break;
			
			}
		}while(opcion!=0);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menu(Scanner sc) {
		// TODO Auto-generated method stub
		
	}
	

}
