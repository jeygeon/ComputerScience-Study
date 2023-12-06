package circularLinkedList;

public class Node<E> {

	private E data = null;

	private Node<E> nextPointer = null;

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

	public Node(E data, Node<E> nextPointer) {
		this.data = data;
		this.nextPointer = nextPointer;
	}

	public Node() {
	}
}
