import java.util.Scanner;

public class SaludoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola, " + nombre + "! Bienvenido a tu aplicación en Java.");

        scanner.close();
    }
}
