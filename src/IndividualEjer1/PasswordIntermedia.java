package IndividualEjer1;

public class PasswordIntermedia extends Password {

    /* La contraseña debe tener al entre 8 y 16 caracteres, al menos un dígito, al menos una minúscula y al menos una mayúscula. */

    public PasswordIntermedia() {
        super("^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$");
    }
}
