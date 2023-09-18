class Node<T>{
	private T data;
	Node<T> nextNode;
	
	public Node(T data)
	{
		this.data = data;
		this.nextNode = null;
		
	}//end constructor 
	
	public void setData(T data) {
		this.data=data;
	}//end setData
	
	public T getData() {
		return data;
	}//end getData
	
	public void setNextNode(Node<T> nextNode) {
		this.nextNode=nextNode;
	}//end setNextNode
	
	public Node<T> getNextNode() {
		return nextNode;
	}//end getNode

}//end class

