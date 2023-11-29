package linkedList;

public class SinglyLinkedList<E> {

	private Node<E> head;

	private Node<E> tail;

	private int size;

	public SinglyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	// 노드 조회 (Search)
	public Node<E> search(int index) {

		// 시작은 처음 노드를 가져와서 순서대로 조회한다.
		Node<E> n = head;
		for (int i=0; i<index; i++) {
			n = n.getNextPointer();
		}

		return n;
	}

	// 노드를 지정한 index에 추가 (add)
	public void addList(Node<E> node, int index) {
		
	}
}
