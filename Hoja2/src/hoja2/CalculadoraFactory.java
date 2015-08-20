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
/**
 * Es el Factory de la clase Calculadora. En esta clase se define el tipo de
 * implementacion que se desea aplicar para el stack. Ya sea ArrayList, Vector
 * o Lista.
 * @author Juan Diego Benitez, Daniela Pocasangre, Belen Hernandez y Alejandro Rivera
 */
public class CalculadoraFactory {
    //metodo que devolvera una instancia del tipo de implementacion que se quiera para el stack
    /**
     * Define el tipo de implementacion a utilizar (de tipo Entero).
     * @param eleccion Contiene la eleccion de si es ArrayList, Vector o Lista.
     * @param eleccion2 Contiene la eleccion de si es Simplemente Encadenada, 
     * Doblemente Encadenada o Circular.
     * @return implementacionStack Objeto nuevo del tipo de implementacion
     * escogido.
     */
    public Stack implementacionInt(int eleccion, int eleccion2){
         Stack<Integer> implementacionStack=null;
            if (eleccion==1){
                implementacionStack = new StackArrayList<Integer>();
            }
            if (eleccion==2){
                implementacionStack = new StackVector<Integer>();
            }
            if (eleccion==3){
                implementacionStack = new StackLista<Integer>(eleccion2);
            }
       return implementacionStack;
    }
    /**
     * Define el tipo de implementacion a utilizar (de tipo String).
     * @param eleccion Contiene la eleccion de si es ArrayList, Vector o Lista.
     * @param eleccion2 Contiene la eleccion de si es Simplemente Encadenada,
     * Doblemente Encadenada o Circular.
     * @return implementacionStack Objeto nuevo del tipo de implementacion
     * escogido.
     */
    public Stack implementacionString(int eleccion, int eleccion2){  
        Stack<String> implementacionStack=null;
            if (eleccion==1){
                implementacionStack = new StackArrayList<String>();
            }
            if (eleccion==2){
                implementacionStack = new StackVector<String>();
            }
            if (eleccion==3){
                implementacionStack = new StackLista<String>(eleccion2);
            }
        return implementacionStack;
    }
    
}
