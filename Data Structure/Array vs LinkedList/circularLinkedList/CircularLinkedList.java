package circularLinkedList;

public class CircularLinkedList<E> {

	private Node<E> head;

	private Node<E> tail;

	private int size;

	public CircularLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	/**
	 * 노드 조회
	 * 
	 * @param index 조회 할 위치
	 * @return
	 */
	public Node<E> search(int index) {

		// 시작은 처음 노드를 가져와서 순서대로 조회한다.
		Node<E> node = head;
		for (int i=0; i<index; i++) {
			node = node.getNextPointer();
		}

		return node;
	}

	/**
	 * 노드 추가
	 * 
	 * @param data 추가할 데이터
	 * @param index 조회 위치
	 */
	public void addNode(E data, int index) {

		Node<E> node = new Node<E>();
		node.setData(data);

		// 범위에 맞지 않는 index가 올 경우 에러 발생
		if(index < 0 || index >= size) {
			System.out.println("list size : " + this.size + ", index : " + index);
			throw new IndexOutOfBoundsException();
		}

		// index가 0이면 리스트 제일 앞에 노드 추가
		if (index == 0) {
			// 첫 번째 노드가 존재하지 않을 경우
			if (this.head == null) {
				this.head = node;
				this.tail = node;
				this.size++;
				return;
			} else {
			// 이미 첫 번째 노드가 존재 할 경우
				Node<E> preHeadNode = this.head;
				if (this.size == 1) {
					node.setNextPointer(preHeadNode);
					node.getNextPointer().setNextPointer(node);
					this.head = node;
					this.size++;
					return;
				} else {
					node.setNextPointer(preHeadNode);
					this.tail.setNextPointer(node);
					this.head = node;
					this.size++;
					return;	
				}
			}
		}

		// index와 list size가 같을 경우 제일 마지막에 노드 추가
		if (index == this.size) {
			Node<E> lastNode = this.tail;
			node.setNextPointer(this.head);
			lastNode.setNextPointer(node);
			this.tail = node;
			this.size++;
			return;
		}

		// index가 0이 아니면 (index - 1)번째 노드를 찾아서 nextPointer 재설정
		if (index != 0) {
			Node<E> preNode = search(index - 1);
			Node<E> nextNode = preNode.getNextPointer();
			node.setNextPointer(nextNode);
			preNode.setNextPointer(node);
			this.size++;
			return;
		}
	}

	/**
	 * 노드 제거
	 * 
	 * @param data 삭제할 데이터
	 */
	public void removeNode(E data) {

		boolean result = false;

		Node<E> preNode = this.head;
		Node<E> targetNode = this.head;
		while(!result) {
			// 삭제할 데이터가 있는 노드를 찾는다
			if (data.equals(targetNode.getData())) {
				
				
				result = true;
			} else {
				preNode = targetNode;
				targetNode = targetNode.getNextPointer();
			}
		}
		return;
	}

	/**
	 * 리스트의 사이즈
	 * 
	 * @return
	 */
	public int size() {

		return this.size;
	}

	/**
	 * 리스트 값
	 * 
	 * @return
	 */
	public String listValue() {

		StringBuilder sb = new StringBuilder();
		Node<E> currentNode = this.head;
		while (currentNode != null) {
			sb.append(currentNode.getData());
			currentNode = currentNode.getNextPointer();
			if (currentNode != null) {
				sb.append(" > ");
			}
		}
		return sb.toString();
	}
}
