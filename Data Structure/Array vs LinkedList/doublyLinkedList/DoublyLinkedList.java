package doublyLinkedList;

public class DoublyLinkedList<E> {

	private Node<E> head;

	private Node<E> tail;

	private int size;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public Node<E> getHeadNode() {

		return this.head;
	}

	public Node<E> getTailNode() {

		return this.tail;
	}

	/**
	 * 노드 조회
	 * 
	 * @param index 조회 할 위치
	 * @return
	 * @throws Exception 
	 */
	public Node<E> search(int index) {

		// 범위에 맞지 않는 index가 올 경우 에러 발생
		if(index < 0 || index >= size) {
			System.out.println("list size : " + this.size + ", index : " + index);
			throw new IndexOutOfBoundsException();
		}

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

		// 범위에 맞지 않는 index가 올 경우 에러 발생
		if(index < 0) {
			System.out.println("list size : " + this.size + ", index : " + index);
			throw new IndexOutOfBoundsException();
		}

		Node<E> targetNode = new Node<E>();
		targetNode.setData(data);

		// index가 0이면 리스트 제일 앞에 노드 추가
		if (index == 0) {
			// 첫 번째 노드가 존재하지 않을 경우
			if (this.head == null && this.size() == 0) {
				this.head = targetNode;
				this.tail = targetNode;
				this.size++;
				return;
			} else {
				/*
				 * 이미 첫 번째 노드가 존재 할 경우
				 * 1. targetNode를 head node로 설정
				 * 2. targetNode의 nextPointer를 기존 head node로 변경
				 * 3. 기존 head node의 prePointer를 targetNode로 변경
				 */
				Node<E> preHeadNode = this.head;
				targetNode.setNextPointer(preHeadNode);
				this.head = targetNode;
				preHeadNode.setPrePointer(this.head);

				this.size++;

				// list의 사이즈가 2일 경우 tail node 재설정
				if (this.size == 2) {
					this.tail = preHeadNode;
				}
				return;
			}
		}

		/*
		 * index와 list size가 같거나 list size보다 큰 index가 올 경우 제일 마지막에 노드 추가
		 * 1. targetNode의 prePointer를 기존 tail node로 설정
		 * 2. tail node의 nextPointer를 targetNode로 설정
		 * 3. targetNode를 tail node로 설정
		 */
		if (index == this.size || index > this.size) {
			targetNode.setPrePointer(this.tail);
			Node<E> tailNode = this.tail;
			tailNode.setNextPointer(targetNode);
			this.tail = targetNode;
			this.size++;
			return;
		}

		/*
		 * 1. targetNode의 nextPointer를 (index + 1)번째 노드로 설정
		 * 2. targetNode의 prePointer를 (index - 1)번째 노드로 설정
		 * 3. (index - 1)번째 노드의 nextPointer를 targetNode로 설정
		 * 4. (index + 1)번째 노드의 prePointer를 targetNode로 설정
		 */
		if (index != 0) {
			Node<E> preNode = search(index - 1);

			if (this.size == 1) {
				targetNode.setPrePointer(preNode);
				preNode.setNextPointer(targetNode);
				
				preNode.setNextPointer(targetNode);
				this.tail = targetNode;
				this.head = preNode;
			} else {
				Node<E> nextNode = preNode.getNextPointer();
				targetNode.setPrePointer(preNode);
				targetNode.setNextPointer(nextNode);
				preNode.setNextPointer(targetNode);
				nextNode.setPrePointer(targetNode);	
			}
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

			// 찾으려는 데이터가 있는 노드가 존재하지 않을 경우 예외발생
			if (targetNode == null) {
				System.out.println("data [ " + data + " ] : is null");
				throw new NullPointerException();
			}

			// 삭제할 데이터가 있는 노드를 찾는다
			if (data.equals(targetNode.getData())) {

				// list size가 1일 경우
				// 삭제할 노드가 head node이면서 tail node일 경우
				if (this.size == 1) {
					this.head = null;
					this.size--;
					return;
				}

				// list size가 2일 경우
				// head node와 tail node만 존재할 경우
				if (this.size == 2) {
					targetNode = null;
					preNode.setNextPointer(null);
					this.tail = preNode;
					this.size--;
					return;
				}

				// list size가 3이상일 경우
				if (this.size >= 3) {
					// 삭제할 노드(targetNode)의 다음 노드를 저장
					Node<E> nextNode = targetNode.getNextPointer();

					/*
					 * 만약 삭제할 노드(targetNode)가 head node라면
					 * 1. targetNode 제거
					 * 2. nextNode의 prePointer를 제거
					 * 3. nextNode를 head node로 설정
					 */
					if (targetNode == this.head) {
						targetNode = null;
						nextNode.setPrePointer(null);
						this.head = nextNode;
						this.size--;
						return;
					}

					/*
					 * 만약 삭제할 노드(targetNode)가 tail node라면
					 * 1. targetNode 제거
					 * 2. preNode의 nextPointer를 제거
					 * 3. preNode를 tail node로 설정
					 */
					if (targetNode == this.tail) {
						targetNode = null;
						preNode.setNextPointer(null);
						this.tail = preNode;
						this.size--;
						return;
					}

					// targetNode 삭제
					targetNode = null;

					/*
					 * preNode의 nextPointer 수정
					 * nextNode의 prePointer 수정
					 */
					nextNode.setPrePointer(preNode);
					nextNode.getPrePointer().setNextPointer(nextNode);
					this.size--;
					result = true;
				}
			} else {
				preNode = targetNode;
				if (targetNode.getNextPointer() == null) {
					targetNode = null;
				} else {
					targetNode = targetNode.getNextPointer();
				}
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
