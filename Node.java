/** Source code from CS215
 * @author Dr. Nathan Johnson */

class Node<T>{
	private T data;
	Node<T> nextNode;

	/** Creates instances of node 
	 * @param T data, data of node */
	public Node(T data)
	{
		this.data = data;
		this.nextNode = null;
		
	}//end constructor 

	/** Sets data
	 * @param T data the data being set into the method */
	public void setData(T data) {
		this.data=data;
	}//end setData

	/** Gets data
	 * @return data, the data of the node */
	public T getData() {
		return data;
	}//end getData

	/** Sets the next node 
	 * @param Node<T> nextNode, setting the next node in the list */
	public void setNextNode(Node<T> nextNode) {
		this.nextNode=nextNode;
	}//end setNextNode

	/** Gets the nextNode
	 * @param nextNode, the data in the next node */
	public Node<T> getNextNode() {
		return nextNode;
	}//end getNode

}//end class

