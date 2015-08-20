/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja2;

/**
 * Clase abstracta que genera metodos que seran utilizados en otras clases.
 * @author  Juan Diego Benitez, Daniela Pocasangre, Belen Hernandez y Alejandro Rivera
 * @see Stack
 */
public abstract class abstractStack<E> implements Stack<E> {
    
    /**
     * Este metodo no realiza nada hasta que se utiliza en otra clase.
     */
    public abstractStack()
   // post: does nothing
   {
        
   }
    /**
     * Regresa true si la lista se encuentra vacia.
     * @return size Regresa 0 si la lista se encuentra vacia.
     */
    public boolean empty()
	// post: returns true if and only if the stack is empty
    {
	return size() == 0;
    }
    
} 
