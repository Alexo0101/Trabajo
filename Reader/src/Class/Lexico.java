package Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Lexico {
    
    private String txtProgram;
    private String txtSymbols;

    public Lexico(String txtProgram, String txtSymbols) {
        this.txtProgram = txtProgram;
        this.txtSymbols = txtSymbols;
       
    }            
    
    public void Read() throws FileNotFoundException{
        
        String Programpath = "C:\\Users\\guerr\\OneDrive\\Escritorio\\"+txtProgram+".txt";
        String SymbolPath = "C:\\Users\\guerr\\OneDrive\\Escritorio\\"+txtSymbols+".txt";
        
        ArrayList<String> ProgramContain = new ArrayList();
        String SymbolsContain = ""; 
        
        
        try{
            File file = new File(Programpath);
            File file2 = new File(SymbolPath);
            
            BufferedReader sc = new BufferedReader(new FileReader (file));
            BufferedReader sc2 =  new BufferedReader(new FileReader (file2));   
            
            String aux = sc.readLine();
            while(aux!=null){                
                ProgramContain.add(aux);
                aux = sc.readLine();
                
            }            
            aux = sc2.readLine();
            while(aux!=null){
                SymbolsContain += aux;
                aux = sc2.readLine();
            } 
  
            
        }catch(Exception e){
            System.out.println("Archivos no encontrados.");
            e.printStackTrace();
        }                                          
        boolean Error = false;
        
        for (int j = 0; j < ProgramContain.size(); j++) 
        {
            for (int i = 0; i < ProgramContain.get(j).length(); i++) 
            {
                for (int k = 0; k < SymbolsContain.length(); k++) 
                {
                    if (SymbolsContain.charAt(k) == ProgramContain.get(j).charAt(i)) {
                        k = 0;
                        i++;
                        if (i == ProgramContain.get(j).length() - 1) {
                            k = SymbolsContain.length();
                        }
                    }
                    if( k == SymbolsContain.length() - 1 ) 
                    {
                        System.out.println("Caracter no existente: " + ProgramContain.get(j).charAt(i));
                        Error = true;
                        k = SymbolsContain.length()-1;
                        i = ProgramContain.get(j).length()-1;
                        j = ProgramContain.size()-1;
                    }
                }
            }
        }
        
        
        if(Error == false){
            System.out.println("Todos los carácteres son correctos.");
        }else{
            System.out.println("El Programa tiene Caracteres invalidos");
        }
        
        
        
    }
}
