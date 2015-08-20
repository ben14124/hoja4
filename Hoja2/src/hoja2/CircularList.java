/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;

/**
 * Clase publica que define los metodos en una implementacion de lista circular.
 * Esta se extiende de la clase abstractLista para obtener los metodos dentro de ella.
 * @see abstractLista
 * @author  Juan Diego Benitez, Daniela Pocasangre, Belen Hernandez y Alejandro Rivera
 */
public class CircularList<E> extends abstractLista<E> {
    protected Node<E> tail; 
    protected int count;
/**
 * Construye una nueva lista circular.
 */
public CircularList()
// pre: constructs a new circular list
{
   tail = null;
   count = 0;
}

/**
 * Agrega un elemento a la cabeza de la lista. El valor debe ser diferente a nulo.
 * @param value Valor de tipo E diferente a null.
 */
public void addFirst(E value)
// pre: value non-null
// post: adds element to head of list
{
   Node<E> temp = new Node<E>(value);
      
   if (tail == null) { // first value added
       tail = temp;
       tail.setNext(tail);
   } 
   else { // element exists in list
       temp.setNext(tail.next());
       tail.setNext(temp);
   }
   count++;
}

/**
 * Agrega un elemento al final de la lista. El valor debe ser diferente a nulo.
 * @param value Valor de tipo E diferente a null.
 */
public void addLast(E value)
// pre: value non-null
// post: adds element to tail of list
{
   // new entry:
   addFirst(value);
   tail = tail.next();
}


// lo dificil es quitar el elemento de la cola
/**
 * Regresa y elimina el valor del final de la lista. La lista debe tener al menos
 * un elemento.
 * @return count Valor de tipo E del final de la lista.
 */
public E removeLast()
// pre: !isEmpty()
// post: returns and removes value from tail of list
{
   Node<E> finger = tail;
   while (finger.next() != tail) {
       finger = finger.next();
   }
   // finger now points to second-to-last value
   Node<E> temp = tail;
   if (finger == tail)
   {
       tail = null;
   } else {
       finger.setNext(tail.next());
       tail = finger;
   } 
   count--;
   return temp.value();
}

   /**
    * Regresa la cantidad de elementos de la lista. 
    * @return count Cantidad de elementos de la lista.
    */
   public int size() //getSize
   // post: returns number of elements in list
  {
    return count;
  }
   
    /**
    * Regresa y elimina el valor del primer elemento de la lista. La lista debe tener
    * al menos un elemento.
    * @return count Valor de tipo E al inicio de la lista.
    */
    public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 {
	Node<E> head = tail.next();
        
        if(count==1){
            head.setNext(null);
        }
        else{
            Node<E> temp= head.next();
            tail.setNext(temp);
        }
	count--;
	return head.value();
 }

    /**
     * Regresa el primer valor de la lista. La lista debe tener al menos un
     * elemento.
     * @return El valor del primer elemento de la lista.
     */
    public E getFirst() 
    // pre: list is not empty
    // post: returns first value in list
    {
           return (tail.next()).value();
    }
 
}  

