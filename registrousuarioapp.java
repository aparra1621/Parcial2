import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroUsuarioApp {

    private static final List<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        System.out.println("=== Registro de Usuarios ===");

        do {
            System.out.print("Nombre completo: ");
            String nombre = sc.nextLine();

            System.out.print("Correo electrónico: ");
            String correo = sc.nextLine();

            System.out.print("Contraseña: ");
            String contrasena = sc.nextLine();

            if (!Validador.validarNombre(nombre)) {
                System.out.println("❌ Nombre inválido. Usa solo letras y al menos dos palabras.");
            } else if (!Validador.validarCorreo(correo)) {
                System.out.println("❌ Correo inválido.");
            } else if (!Validador.validarContrasena(contrasena)) {
                System.out.println("❌ Contraseña no cumple con los requisitos.");
            } else {
                Usuario nuevoUsuario = new Usuario(nombre, correo, contrasena);
                usuarios.add(nuevoUsuario);
                System.out.println("✅ Usuario registrado con éxito.");
            }

            System.out.print("¿Registrar otro usuario? (s/n): ");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\n=== Usuarios Registrados ===");
        usuarios.forEach(System.out::println);
    }
}
