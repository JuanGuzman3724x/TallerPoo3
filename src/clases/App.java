package clases;

import java.util.Scanner;


public class App {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		SistemaImp sistema=new SistemaImp();
		sistema.menu(scanner);
		
		
	}

}
