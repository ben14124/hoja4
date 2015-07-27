package hoja2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Diego, Daniela, Belen, Alejandro
 */
public class DriverCalc{

	public static void main(String[] args){
		boolean hacer = true;
                File file = new File("file.txt");
		Calculadora Casio = new NuestraCalculadora();
		try{
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    try {
                        for(String line; (line = br.readLine()) != null; ){
                            Casio.setString(line);
                            Casio.meterVector();
                            hacer=Casio.calcularVector();
                            if (hacer==true){ //si no hay error se obtiene resultado
                            	    System.out.println("El resultado es: "+Casio.getResultado());
                            }
                            else if (hacer==false){ //si hay error se indica
                            	    System.out.println("ERROR.");
                            }
                        }
                    }
                    catch(IOException ex) {
                        Logger.getLogger(DriverCalc.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
		catch(FileNotFoundException ex) {
                Logger.getLogger(DriverCalc.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
}

