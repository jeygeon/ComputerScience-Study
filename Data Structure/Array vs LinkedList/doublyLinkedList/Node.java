package doublyLinkedList;

public class Node<E> {

	private E data = null;

	private Node<E> nextPointer = null;

	private Node<E> prePointer = null;

	public void setData(E data) {

		this.data = data;
	}

	public E getData() {

		return this.data;
	}

	public void setNextPointer(Node<E> nextPointer) {

		this.nextPointer = nextPointer;
	}

	public Node<E> getNextPointer() {

		return this.nextPointer;
	}

	public void setPrePointer(Node<E> prePointer) {

		this.prePointer = prePointer;
	}

	public Node<E> getPrePointer() {

		return this.prePointer;
	}

	public Node(E data, Node<E> nextPointer) {
		this.data = data;
		this.nextPointer = nextPointer;
	}

	public Node(E data, Node<E> nextPointer, Node<E> prePointer) {
		this.data = data;
		this.nextPointer = nextPointer;
		this.prePointer = prePointer;
	}

	public Node() {
	}
}
