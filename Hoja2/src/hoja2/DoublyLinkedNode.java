package hoja2; 
/**
 * Clase publica que define los metodos en una implementacion de nodo doblemente encadenado.
 * @author  Juan Diego Benitez, Daniela Pocasangre, Belen Hernandez y Alejandro Rivera
 */
public class DoublyLinkedNode<E>
{
protected E data;
protected DoublyLinkedNode<E> nextElement;
protected DoublyLinkedNode<E> previousElement;

/**
 * Se construye un elemento como nuevo valor inicial de la lista.
 * @param v Es un valor de tipo E.
 * @param next Es una referencia a lo que se encuentra luego del valor.
 * @param previous Es una referencia a lo que se encuentra previo al valor.
 */
public DoublyLinkedNode(E v, DoublyLinkedNode<E> next, DoublyLinkedNode<E> previous) {
    data = v;
    nextElement = next;
    if (nextElement != null)
        nextElement.previousElement = this;
    previousElement = previous;
    if (previousElement != null)
        previousElement.nextElement = this;
}

/**
 * Construye un solo elemento.
 * @param v Es un valor de tipo E.
 */
public DoublyLinkedNode(E v)
// post: constructs a single element
{
    this(v,null,null);
}

/**
 * Regresa el elemento previo al valor seleccionado.
 * @return previosElement Elemento anterior de tipo E.
 */
public DoublyLinkedNode<E> previous(){
    return previousElement; 
}

/**
 * Regresa el valor asociado a ese elemento.
 * @return data Es el valor asociado.
 */
public E value(){
    return data;
}

/**
 * Establece una referencia al proximo valor de la lista.
 * @param next Referencia al elemento siguiente.
 */
public void setNext(DoublyLinkedNode<E> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

    /**
     * Regresa el valor del proximo elemento de la lista.
     * @return nextElement Valor del elemento siguiente.
     */
   public DoublyLinkedNode<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }
   
}