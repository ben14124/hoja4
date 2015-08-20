package hoja2; 
/**
 * Interfaz publica que genera metodos utilizados en listas.
 * @author  Juan Diego Benitez, Daniela Pocasangre, Belen Hernandez y Alejandro Rivera
 */
public interface Lista<E> 
{
    /**
     * Regresa la cantidad de elementos de la lista. 
     * @return count Cantidad de elementos de la lista.
     */
    public int size();
    // post: returns number of elements in list

    /**
     * Regresa true si la lista se encuentra vacia.
     * @return size Regresa 0 si la lista se encuentra vacia.
     */
    public boolean isEmpty();
    // post: returns true iff list has no elements

    /**
     * Agrega un elemento a la cabeza de la lista. El valor debe ser diferente a nulo.
     * @param value Valor de tipo E diferente a null.
     */
    public void addFirst(E value);
    // post: value is added to beginning of list
    
    /**
     * Regresa el primer valor de la lista. La lista debe tener al menos un
     * elemento.
     * @return El valor del primer elemento de la lista.
     */
    public E getFirst();
    
    /**
     * Regresa y elimina el valor del primer elemento de la lista. La lista debe tener
     * al menos un elemento.
     * @return count Valor de tipo E al inicio de la lista.
     */
    public E removeFirst();

}
