package hoja2;

public abstract class abstractLista<E> implements Lista<E> {
    
    public abstractLista()
   // post: does nothing
   {
   }
    public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
    
} 
