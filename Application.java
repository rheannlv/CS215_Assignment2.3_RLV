
public class Application {

	public static void main(String[] args) {
		
		//Instantiating queue, vegeQ
		Queue<String> vegeQ = new Queue<String>();
		
		//Testing enqueue current people in line
		vegeQ.enqueue("Bill");
		vegeQ.enqueue("Alice");
		vegeQ.enqueue("Bob");
		
		//Testing getFront and output who is at the front of queue 
		System.out.println(vegeQ.getFront() + " is at the front of the queue." + "\n");
		
		//Testing dequeue and output the costumers who have been served.
		System.out.println(vegeQ.dequeue() + " has been served." + "\n");
		
		//Testing display and output of current costumers in queue 
		System.out.println("In the Queue: ");
		vegeQ.display();
		System.out.println();
		
		vegeQ.enqueue("Jane");
		System.out.println("Jane arrives." + "\n");
		
		System.out.println("In the Queue: ");
		vegeQ.display();
		System.out.println();
		
		vegeQ.enqueue("Hamad");
		System.out.println("Hamad arrives." + "\n");
	
		System.out.println("In the Queue: ");
		vegeQ.display();
		System.out.println();
		
		System.out.println(vegeQ.dequeue() + " has been served." + "\n");
		
		System.out.println("In the Queue: ");
		vegeQ.display();
		System.out.println();
		
		System.out.println(vegeQ.dequeue() + " has been served." + "\n");
		
		System.out.println("In the Queue: ");
		vegeQ.display();
		System.out.println();
		
		vegeQ.enqueue("Jim");
		System.out.println("Jim arrives.");
		System.out.println();
		
		System.out.println("In the Queue: ");
		vegeQ.display();
		System.out.println();
		
		System.out.println(vegeQ.dequeue() + " has been served." + "\n");
		
		System.out.println("In the Queue: ");
		vegeQ.display();
		System.out.println();
		
		System.out.println(vegeQ.dequeue() + " has been served." + "\n");
		
		System.out.println("In the Queue: ");
		vegeQ.display();
		System.out.println();
		
		//Testing isEmpty before and after clear method
		System.out.println("Is the queue empty: " + vegeQ.isEmpty());
		vegeQ.clear();
		System.out.println("We're closing, is the queue empty now: " + vegeQ.isEmpty());
		
	}//end main

}//end class
