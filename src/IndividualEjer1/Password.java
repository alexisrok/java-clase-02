package IndividualEjer1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private String pwd;
    private String regex;
    private Pattern patron;

    //Constructor
    public Password(String regex){
        this.patron = Pattern.compile(regex);
    }

    public void setValue(String pwd) throws Exception {
        Matcher m = this.patron.matcher(pwd);
        boolean correcto = m.find();

        if(correcto){
            this.pwd = pwd;
        }else {
            throw new Exception("La contraseña no cumple con el standard");
        }
    }
}
