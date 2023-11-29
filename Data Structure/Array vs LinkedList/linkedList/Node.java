package linkedList;

public class Node<E> {

	private E data;

	private Node<E> nextPointer;

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
}
