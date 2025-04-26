import java.util.regex.*;

public class Validador {

    public static boolean validarNombre(String nombre) {
        return nombre.matches("^[A-ZÁÉÍÓÚÑa-záéíóúñ]+(\\s[A-ZÁÉÍÓÚÑa-záéíóúñ]+)+$");
    }

    public static boolean validarCorreo(String correo) {
        return correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
    }

    public static boolean validarContrasena(String contrasena) {
        if (contrasena.length() < 8) return false;

        Pattern mayus = Pattern.compile("[A-Z]");
        Pattern minus = Pattern.compile("[a-z]");
        Pattern num = Pattern.compile("\\d");
        Pattern especial = Pattern.compile("[^a-zA-Z0-9]");

        return mayus.matcher(contrasena).results().count() >= 2 &&
               minus.matcher(contrasena).results().count() >= 3 &&
               num.matcher(contrasena).find() &&
               especial.matcher(contrasena).find();
    }
}
