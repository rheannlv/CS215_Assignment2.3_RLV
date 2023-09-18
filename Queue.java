/**
 * 
 * @author RVera
 * Implemented generic queue class 
 * utilizing linked list
 * 
 */
public class Queue<T> implements QueueInterface<T> {
	
	private Node<T> qFront; //head
	private Node<T> qBack; //tail
	private int length;
	
	/** Creates instances of nodes */
	public Queue() {
		
		qFront = null;
		qBack = null;
		length = 0;
	}//end constructor 
	
	/** Adds new node to the back of the queue
	 * Increments the queue
	 * @param T newEntry new node  */
	@Override
	public void enqueue(T newEntry) {
		
	Node<T> newNode = new Node<T>(newEntry);
		 
		if (isEmpty()) {
			qFront = newNode;
			qBack = qFront;
		} else {
			
		qBack.nextNode=newNode;
		qBack = qBack.nextNode;
		qBack.nextNode = null;
		}
		
		length++;
		
	}//end enqueue
	
	/** Removes node from the front of the queue
	 * decrements the queue
	 * @return deQ data from the node removed from queue */
	@Override
	public T dequeue() {
		
		T deQ = null;
		
		if (!isEmpty()) {
			deQ = qFront.getData();
			qFront = qFront.getNextNode();
		}
		 	if (qFront == null) {
		 		qBack = null;
		 	}//end if
		 	
		length--;
		
		return deQ;
	}//end dequeue
	
	/** Retrieves data first in the queue 
	 * @return front returns data from the first node if it isn't empty */ 
	@Override
	public T getFront() {
		T front = null;
		
		if (!isEmpty()) {
			front = qFront.getData();
		}
		return front;
		
	}//end getFront
	
	/** Checks if queue is empty
	 * @return true if empty, false otherwise */ 
	@Override
	public boolean isEmpty() {
		
		if (qFront == null) {
			return true;
		} else {
			return false;
		}
		
	}//end isEmpty
	
	/** Empties all entries in queue */
	@Override
	public void clear() {
		qFront = null;
		qBack  = null;
		
	}//end clear
	
	/** Displays the current data in the queue */
	public void display() {
		Node current = qFront;
		
		while (current != null) {
			
			System.out.println(current.getData());
			current = current.getNextNode();
		}
	}
	
}//end class
