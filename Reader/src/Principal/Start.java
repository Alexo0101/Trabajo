package Principal;

import Class.Lexico;
import java.io.FileNotFoundException;
import Class.sintactico;

public class Start {

    public static void main(String[] args) throws FileNotFoundException {
        Lexico txt = new Lexico("ejem", "caracteres");
        //sintactico txt1 = new sintactico("ejem","palabras_res");
        txt.Read();
       // txt1.read2();
    }
    
}
