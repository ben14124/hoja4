/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;

/**
 *
 * @author dbs_jd
 */


public class CircularList<E> extends abstractLista<E> {
    protected Node<E> tail; 
    protected int count;

public CircularList()
// pre: constructs a new circular list
{
   tail = null;
   count = 0;
}

public void addFirst(E value)
// pre: value non-null
// post: adds element to head of list
{
   Node<E> temp = new Node<E>(value);
   if (tail == null) { // first value added
       tail = temp;
       tail.setNext(tail);
   } else { // element exists in list
       temp.setNext(tail.next());
       tail.setNext(temp);
   }
   count++;
}


public void addLast(E value)
// pre: value non-null
// post: adds element to tail of list
{
   // new entry:
   addFirst(value);
   tail = tail.next();
}


// lo dificil es quitar el elemento de la cola

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

   public int size() //getSize
   // post: returns number of elements in list
  {
    return count;
  }
   
   
     public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 {
	Node<E> temp = tail.next();
	//head = head.next(); // move head down list
	count--;
	return temp.value();
 }

 public E getFirst() 
 // pre: list is not empty
 // post: returns first value in list
 {
	return (tail.next()).value();
 }
 
}

