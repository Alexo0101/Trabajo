package Class;
import Class.Lexico;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class sintactico {

    private final String txtProgram;
    private final String txtReserv;
    
     public sintactico(String txtProgram, String txtReserv) {
        this.txtProgram = txtProgram;
        this.txtReserv = txtReserv;
    }   
     
    public void read2() throws FileNotFoundException {
        String Programpath = "C:\\Users\\Usuario1\\Desktop\\"+txtProgram+".txt";
        String Reservpath = "C:\\Users\\Usuario1\\Desktop\\" + txtReserv + ".txt";
        
        ArrayList<String> ProgramContain = new ArrayList();
        ArrayList<String> ReservContain = new ArrayList();
        ArrayList<String> Palabra = new ArrayList();
        
         try{
            File file = new File(Programpath);
            File file3 = new File(Reservpath);
            
            BufferedReader sc = new BufferedReader(new FileReader (file));
            BufferedReader sc3 = new BufferedReader(new FileReader (file3));
            
           String aux = sc.readLine();
            while(aux!=null){                
                ProgramContain.add(aux);
                aux = sc.readLine();
                
            }          
            
            aux = sc3.readLine();
            while(aux!=null){      
               // System.out.println(aux);
                ReservContain.add(aux);
                aux = sc3.readLine();
                //System.out.println(ReservContain.get(0));
            }   
                  
            
        }catch(Exception e){
            System.out.println("Archivos no encontrados.");
            e.printStackTrace();
        }  
         
        
         for (int i = 0; i < ProgramContain.size(); i++) {
            Palabra.addAll( Arrays.asList(ProgramContain.get(i).split( " " )) );
        }
         
         boolean v = false;
        for (int i = 0; i < ReservContain.size(); i++) 
        {
            
            if (Palabra.get(0).equals(ReservContain.get(i))) 
            {
             v=true;
                System.out.println("se encontro una coincidencia");
                for (int j = 1; j < Palabra.size(); j++) 
                {
                    //j++;
                    switch(i)
                    {
                        case 0: //entero
                            //si esta palabra es una variable y el ultimo caracter
                            //es un punto y coma, entonces esta bien escrito
                            //variable=l(l/n)*
                            System.out.println("se encontro la palabra ENTERO");
                            String l = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
                            String n = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
                            boolean error = false;
                            for (int k = 0; k < l.length(); k++) {
                                if (Palabra.get(j).charAt(0) == l.charAt(k)) {
                                     
                                    for (int m = 1; m < Palabra.get(j).length(); m++) 
                                    {
                                        for (int o = 0; o < n.length() ; o++) 
                                        {
                                            if (Palabra.get(j).charAt(m) == n.charAt(o)) {
                                                o = 0;
                                                m++;
                                                if (m == Palabra.get(j).length() - 1) {
                                                    o = n.length();
                                                    System.out.println("la Variable cumple con los requisitos");          
                                                     o = n.length();
                                                m = Palabra.get(j).length();
                                               // k = l.length();
                                               j = Palabra.size();
                                               
                                                }
                                            }
                                            if(o == n.length()-1) 
                                            {
                                                System.out.println("variable");
                                                if (Palabra.get(j).charAt(Palabra.get(j).length()- 1) == ';') 
                                                {
                                                    System.out.println("Final con punto y coma");
                                                    o = n.length();
                                                    m = Palabra.get(j).length();
                                                    k = l.length();
                                                    j = Palabra.size();
                                                    error = true;
                                                }
                                                else{
                                                System.out.println("variable invalida");
                                                o = n.length();
                                                m = Palabra.get(j).length();
                                                k = l.length();
                                                j = Palabra.size();
                                                error = true;
                                                }
                                            }
                                            //Solo puede haber un ; al final de la cadena
                                            if (m < Palabra.get(j).length()-1 &&  Palabra.get(j).charAt(m) ==';') {
                                                System.out.println("hay un ; antes del final de la variable");
                                            }
                                            
                                        }
                                       
                                    }
                            }
                            }

                            break;
                        case 1: 
                            System.out.println("se encontro la palabra ENTERO");
                            String l1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
                            String n1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
                            boolean error1 = false;
                            for (int k = 0; k < l1.length(); k++) {
                                if (Palabra.get(j).charAt(1) == l1.charAt(k)) {
                                     
                                    for (int m = 1; m < Palabra.get(j).length(); m++) 
                                    {
                                        for (int o = 0; o < n1.length() ; o++) 
                                        {
                                            if (Palabra.get(j).charAt(m) == n1.charAt(o)) {
                                                o = 0;
                                                m++;
                                                
                                                if (m == Palabra.get(j).length() - 1) {
                                                    o = n1.length();
                                                    System.out.println("la Variable cumple con los requisitos");          
                                                     o = n1.length();
                                                m = Palabra.get(j).length();
                                               // k = l.length();
                                               j = Palabra.size();
                                                }
                                            }
                                            if(o == n1.length()-1) 
                                            {
                                                System.out.println("variable");
                                                if (Palabra.get(j).charAt(Palabra.get(j).length()- 1) == ';') 
                                                {
                                                    System.out.println("final con punto y coma");
                                                }
                                                else{
                                                System.out.println("variable invalida");
                                                o = n1.length();
                                                m = Palabra.get(j).length();
                                                k = l1.length();
                                                j = Palabra.size();
                                                error1 = true;
                                                }
                                            }
                                            //Solo puede haber un ; al final de la cadena
                                            if (m < Palabra.get(j).length()-1 &&  Palabra.get(j).charAt(m) ==';') {
                                                System.out.println("hay un ; antes del final de la variable");
                                            }
                                            
                                        }
                                       
                                    }
                            }
                            }

                            break;
                                  
                    }
                    j++;
                }
           }else
            {
                System.out.println("Error sintactico");
            }  
        }
         
        
         
         
    }
    
    
    
 
    
    
    
    
}
