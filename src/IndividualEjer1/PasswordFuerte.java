package IndividualEjer1;

public class PasswordFuerte extends Password{

    /* La contraseña debe tener al entre 8 y 16 caracteres, al menos un dígito, al menos una minúscula y al menos una mayúscula y un caracter especial. */
    public PasswordFuerte() {
        super("^(?=.*[A-Z].*[A-Z])(?=.*[!@#$&*])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8}$\n");
    }

}
