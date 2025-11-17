package clases;

import java.util.Scanner;


public class App {
	static Scanner scanner = new Scanner(System.in);
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
			case 1:break;
			case 2:break;
			case 3 :break;
			case 4:break;
			
			}
		}while(opcion!=0);
		
		
	}
	public static  void menu() {
		

		
	}
	public static void menuAdmin(Scanner sc) {
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
		
		
	}
	
	public static void main(String[] args) {
		menuUsuario(scanner);
		
	}

}
