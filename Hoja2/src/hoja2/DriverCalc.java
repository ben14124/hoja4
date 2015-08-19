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
import java.util.Scanner;

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
                Scanner scan = new Scanner (System.in);
                int eleccion; //contendra un numero correspondiente al tipo de implementacion seleccionada
                int eleccionLista; //una eleccion temporal de lista
		boolean hacer = true;
                int eleccion2=0;
                File file = new File("file.txt");
                //se solicita el tipo de implementacion al usuario
                System.out.println("Indique por medio del numero que implementacion para el Stack desea utilizar\n1.ArrayList\n2.Vector\n3.Lista");
                eleccion= scan.nextInt();
                //de seleccionar una lista, se solicita el tipo de lista
                if (eleccion == 3){
                    System.out.println("Que tipo de lista?\n1.Simplemente Encadenada\n2.Doblemente Encadenada\n3.Circular");
                    eleccionLista=scan.nextInt();
                    //se modifica el valor de eleccion dependiendo del tipo de lista
                    if (eleccionLista==1){
                        eleccion2=3;
                    }
                    if (eleccionLista==2){
                        eleccion2=4;
                    }
                    if (eleccionLista==3){
                        eleccion2=5;
                    }
                }
                /*
                eleccion =1 es un ArrayList
                eleccion =2 es un vector
                eleccion =3 es una singly linked list
                eleccion =4 es una double linked list
                eleccion =5 es una circular list
                */
                 //se instancia la clase factory
                CalculadoraFactory factoryCalcu = new CalculadoraFactory();
                //se obtiene un stack de Int de acuerdo a la implementacio deseada
                Stack stackInt= factoryCalcu.implementacionInt(eleccion, eleccion2);
                //se obtiene un stack de String de acuerdo a la implementacion deseada
                Stack stackString= factoryCalcu.implementacionString(eleccion, eleccion2);
                
                //se instancia la clase NuestraCalculadora con los stacks como parametros
		Calculadora Casio = NuestraCalculadora.getCalculadora(stackString, stackInt);//Se crea la instancia de NuestraCalculadora a partir del patron de diseno singleton
		
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

