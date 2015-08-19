/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja2;  

/**
 *
 * @author DLBarrios
 */
public class StackLista<E> implements Stack<E>
{        
        Lista<E> data;
    
	public StackLista(int valor)
	// post: constructs a new, empty stack
	{
            if(valor==1){
               data = new DoublyLinkedList<E>();
            }
            if(valor==2){
                data = new CircularList<E>();
            }
            else{
                data = new SinglyLinkedList<E>();
            }
	}

	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.addFirst(item);
	}

	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.removeFirst();
	}

	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.getFirst();
	}
	
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}
    
}
