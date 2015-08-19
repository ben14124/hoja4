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
 * @author DLBarrios
 */
public class StackLista<E> implements Stack<E>
{        
        Lista<E> data;
    
	public StackLista(int valor)
	// post: constructs a new, empty stack
	{
            if(valor==1){
               data = new SinglyLinkedList<E>();
            }
            if(valor==2){
                data = new DoublyLinkedList<E>();
            }
            if(valor==3){
                data = new CircularList<E>();
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
