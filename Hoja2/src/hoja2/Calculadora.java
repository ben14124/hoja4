/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;

/**
 *Esta clase es la interfaz del programa.
 * @author Juan Diego Benitez, Daniela Pocasangre, Belen Hernandez y Alejandro Rivera
 */
public interface Calculadora {
    /**
     * Indica la linea del documento de texto que se utilzara.
     * @param linea Linea a utilizar en el codigo.
     */
   public void setString(String linea);

   /**
    * Identifica si la linea contiene numeros o codigos, 
    * tambien cuenta la cantidad de cada uno de ellos y los inserta en el vector.
    */
   public void meterVector();

   /**
    * Sirve para comprobar que la linea ingresada no tenga ningun error.
    * @return calcular: De tipo boolean. Contiene false si se tiene un error o true si es correcto.
    */
   public boolean calcularVector();

   /**
    * Regresa el resultado de la linea de operaciones.
    * @return resultado: De tipo integer. Contiene el resultado final de la linea.
    */
   public int getResultado();

}
