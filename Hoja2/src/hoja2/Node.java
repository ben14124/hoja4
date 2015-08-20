package hoja2; 
/**
 * Clase publica que define los metodos en una implementacion de Nodo.
 * @author  Juan Diego Benitez, Daniela Pocasangre, Belen Hernandez y Alejandro Rivera
 */
public class Node<E> {
   protected E data; // value stored in this element
   protected Node<E> nextElement; // ref to next

   /**
    * Se construye un elemento como nuevo valor inicial de la lista.
    * @param v Es un valor de tipo E.
    * @param next Es una referencia al resto de la lista.
    */
   public Node(E v, Node<E> next)
   // pre: v is a value, next is a reference to 
   //      remainder of list
   // post: an element is constructed as the new 
   //      head of list
   {
       data = v;
       nextElement = next;
   }

   /**
    * Construye un elemento como un nuevo valor al final de la lista.
    * @param v Es un valor de tipo E.
    */
   public Node(E v)
   // post: constructs a new tail of a list with value v
   {
      this(v,null);
   }

   /**
    * Regresa una referencia al proximo valor de la lista.
    * @return nextElement Es el siguiente valor de la lista.
    */
   public Node<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }

   /**
    * Establece una referencia al nuevo valor siguiente.
    * @param next Es el siguiente valor de la lista.
    */
   public void setNext(Node<E> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

   /**
    * Regresa el valor asociado a ese elemento.
    * @return data Es el valor asociado.
    */
   public E value()
   // post: returns value associated with this element
   {
      return data;
   }

   /**
    * Establece el valor asociado a ese elemento.
    * @param value Es el valor asociado de tipo E.
    */
   public void setValue(E value)
   // post: sets value associated with this element
   {
      data = value;
   }
    
}
