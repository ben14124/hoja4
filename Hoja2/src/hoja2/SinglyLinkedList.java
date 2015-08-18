package hoja2;

public class SinglyLinkedList<E> extends abstractLista<E> {
    
   protected int count; // list size
   protected Node<E> head; // ref. to first element

   public SinglyLinkedList()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }
   
   public int size()
   // post: returns number of elements in list
  {
    return count;
  }
  
  public void addFirst(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     if (count>0){
      head = new Node<E>(value, head);
     }
     else if (count==0){
     head = new Node<E>(value);

     }
          count++;
  }
  
  public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 {
	Node<E> temp = head;
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
