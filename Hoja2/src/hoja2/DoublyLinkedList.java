/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;

/**
 * Clase publica que define los metodos en una implementacion de lista doblemente encadenada.
 * Esta se extiende de la clase abstractLista para obtener los metodos dentro de ella.
 * @see abstractLista
 * @author  Juan Diego Benitez, Daniela Pocasangre, Belen Hernandez y Alejandro Rivera
 */
public class DoublyLinkedList<E> extends abstractLista<E> {
  //  protected int count; 
    //protected DoublyLinkedNode<E> head;
//}
protected int count;
protected DoublyLinkedNode<E> head;
protected DoublyLinkedNode<E> tail;

/**
 * Regresa la cantidad de elementos de la lista. 
 * @return count Cantidad de elementos de la lista.
 */
public int size(){
    return count;
}

/**
 * Construye una nueva lista doblemente encadenada.
 */
public DoublyLinkedList()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}

/**
 * Agrega un elemento a la cabeza de la lista. El valor debe ser diferente a nulo.
 * @param value Valor de tipo E diferente a null.
 */
public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
{
   // construct a new element, making it head
   head = new DoublyLinkedNode<E>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}

/**
 * Agrega un elemento al final de la lista. El valor debe ser diferente a nulo.
 * @param value Valor de tipo E diferente a null.
 */
public void addLast(E value)
// pre: value is not null
// post: adds new value to tail of list
{
   // construct new element
   tail = new DoublyLinkedNode<E>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}
/**
 * Regresa y elimina el valor del final de la lista. La lista debe tener al menos
 * un elemento.
 * @return count Valor de tipo E del final de la lista.
 */
public E removeLast()
// pre: list is not empty
// post: removes value from tail of list
{
   DoublyLinkedNode<E> temp = tail;
   tail = tail.previous();
   if (tail == null) {
       head = null;
   } else {
       tail.setNext(null);
   }
   count--;
   return temp.value();
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
          DoublyLinkedNode<E> temp = head;
          head = head.next(); // move head down list
          count--;
          return temp.value();
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
           return head.value();
    }

}
