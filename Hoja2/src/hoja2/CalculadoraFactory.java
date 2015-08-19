/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2; 
/**
 *
 * @author Ma. Belen
 */
public class CalculadoraFactory {
    //metodo que devolvera una instancia del tipo de implementacion que se quiera para el stack
    public Stack implementacionInt(int eleccion, int eleccion2){
         Stack<Integer> implementacionStack = null;
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
        Stack<String> implementacionStack = null;
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
