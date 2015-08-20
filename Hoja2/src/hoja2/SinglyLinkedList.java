package hoja2;

/**
 * Clase publica que define los metodos en una implementacion de lista simplemente encadenada.
 * Esta se extiende de la clase abstractLista para obtener los metodos dentro de ella.
 * @see abstractLista
 * @author  Juan Diego Benitez, Daniela Pocasangre, Belen Hernandez y Alejandro Rivera
 */
public class SinglyLinkedList<E> extends abstractLista<E> {
    
   protected int count; // list size
   protected Node<E> head; // ref. to first element

   /**
    * Construye una nueva lista simplemente encadenada.
    */
   public SinglyLinkedList()
   // post: generates an empty list
   {
      head = null;
      count = 0; 
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
    * Agrega un elemento a la cabeza de la lista. El valor debe ser diferente a nulo.
    * @param value Valor de tipo E diferente a null.
    */
  public void addFirst(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     if (count>0){
      head = new Node<E>(value, head);
     }
     else if (count==0){ //la cola
     head = new Node<E>(value);

     }
          count++;
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
	Node<E> temp = head;
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
 
 /**
  * Regresa y elimina el valor del final de la lista. La lista debe tener al menos
  * un elemento.
  * @return count Valor de tipo E del final de la lista.
  */
 public E removeLast(){
     E cola = head.value(); //inicializamos la variable cola 
     int countlast = count; //guardamos el valor del contador
     while (countlast!=0){ //hasta que lleguemos al final
         head = head.next(); //corremos al siguiente nodo
         countlast--; //restamos 1 al contador temporal
         
     }
     cola = head.value(); //obtenemos el valor del ultimo nodo
     return cola; //retornamos su valor
 }
}
