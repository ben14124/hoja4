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
 *
 * @author Ma. Belen
 */
public class CalculadoraFactory {
    //metodo que devolvera una instancia del tipo de implementacion que se quiera para el stack
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
