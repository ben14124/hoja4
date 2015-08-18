/***************************************************
Universidad del Valle de Guatemala
Juan Diego Benitez C. - 14124
Daniela I. Pocasangre A. - 14162
Ma. Belen Hernandez - 14361
Jose Alejandro Rivera - 14213
Algoritmos y Estructuras de Datos
Seccion 30
***************************************************/
package hoja2;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Driver del programa Calculadora. Aqui se define el documento de texto
 * que se va a utilizar y se imprimen los resultados.
 * @see Calculadora 
 * @see NuestraCalculadora
 * @see Stack
 * @see StackVector
 * @author Juan Diego Benitez, Daniela Pocasangre, Belen Hernandez y Alejandro Rivera
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
                            System.out.println("Operacion ingresada: " + line + "\n");
                            Casio.setString(line);
                            Casio.meterVector();
                            hacer=Casio.calcularVector();
                            if (hacer==true){ //si no hay error se obtiene resultado
                            	    System.out.println("El resultado es: "+Casio.getResultado());
                            }
                            else if (hacer==false){ //si hay error se indica
                            	    System.out.println("Error. Operacion ingresada no valida.");
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

