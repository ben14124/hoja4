package hoja2;

/**
 * Clase abstracta que genera metodos que seran utilizados en otras clases.
 * @author  Juan Diego Benitez, Daniela Pocasangre, Belen Hernandez y Alejandro Rivera
 * @see Lista
 */
public abstract class abstractLista<E> implements Lista<E> {
    
    /**
     * Este metodo no realiza nada hasta que se utiliza en otra clase.
     */
    public abstractLista()
   // post: does nothing
   {
        
   }
    /**
     * Regresa true si la lista se encuentra vacia.
     * @return size Regresa 0 si la lista se encuentra vacia.
     */
    public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
    
} 
