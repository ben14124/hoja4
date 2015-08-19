/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja2;

/**
 *
 * @author Daniela
 */
public abstract class abstractStack<E> implements Stack<E> {
    
    public abstractStack()
   // post: does nothing
   {
        
   }
    public boolean empty()
	// post: returns true if and only if the stack is empty
    {
	return size() == 0;
    }
    
} 
