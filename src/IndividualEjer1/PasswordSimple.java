package IndividualEjer1;

public class PasswordSimple extends Password{

    //Minimo letras y numeros
    public PasswordSimple() {
        super("^[A-Za-z0-9]$/g");
    }
}
