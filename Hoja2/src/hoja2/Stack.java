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
 * Interface Stack. Esta clase contiene los metodos necesarios en un Stack (pilas).
 * @author Juan Diego Benitez, Daniela Pocasangre, Belen Hernandez y Alejandro Rivera
 */
public interface Stack<E> 
{

   /**
    * Un elemento es agregado a la pila. Agrega el elemento pero no lo elimina.
    * @param item Es el elemento a agregar.
    */
    public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
   /**
    * El elemento es borrado de la pila. La pila no debe estar vacia.
    * El elemento mas recientemente agregado (push) es eliminado y regresado.
    * @return El elemento agregado recientemente.
    */
   public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   /**
    * Se observa un elemento en la pila. La pila no debe estar vacia.
    * @return El primer elemento de la pila.
    */
   public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   /**
    * Comprueba que la pila este vacia. 
    * @return Regresa true solo si la pila esta vacia.
    */
   public boolean empty();
   // post: returns true if and only if the stack is empty
   
   /**
    * Indica el tamaño de la pila. 
    * @return El numero de elementos en la pila.
    */
   public int size();
   // post: returns the number of elements in the stack

}
