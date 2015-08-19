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

public class DoublyLinkedList<E> extends abstractLista<E> {
  //  protected int count;
    //protected DoublyLinkedNode<E> head;
//}
//public DoublyLinkedList<E> extends abstractList<E>
protected int count;
protected DoublyLinkedNode<E> head;
protected DoublyLinkedNode<E> tail;

public int size(){
    return count;
}

public DoublyLinkedList()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}


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

  public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 {
	DoublyLinkedNode<E> temp = head;
	head = head.next(); // move head down list
	count--;
	return temp.value();
 }

 public E getFirst()
 // pre: list is not empty
 // post: returns first value in list
 {
	return head.value();
 }
 
 



}
