package clases;

import java.util.Scanner;

public interface Sistema {
	void menuUsuario(Scanner sc);
	void menuAdmin(Scanner sc);
	void menu(Scanner sc);
	void verProyecto();
	void verTarea();
	void actualizarTarea();
	void aplicarVisitor();

}
