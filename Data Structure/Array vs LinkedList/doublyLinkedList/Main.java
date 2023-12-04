package doublyLinkedList;

public class Main {

	@SuppressWarnings("unchecked")
	public static <E> void main(String[] args) {

		DoublyLinkedList<E> doublyLinkedList = new DoublyLinkedList<>();
		doublyLinkedList.addNode((E) "1", 0);
		doublyLinkedList.addNode((E) "2", 1);
		doublyLinkedList.addNode((E) "3", 2);
		doublyLinkedList.addNode((E) "4", 3);
		System.out.println("==================== 이중 연결 리스트 최초 생성 ====================");
		System.out.println("doublyLinkedList value : " + doublyLinkedList.listValue()); // 1 > 2 > 3 > 4
		System.out.println("doublyLinkedList size : " + doublyLinkedList.size()); // 4
		System.out.println("doublyLinkedList head node : " + doublyLinkedList.getHeadNode().getData()); // 1
		System.out.println("doublyLinkedList tail node : " + doublyLinkedList.getTailNode().getData()); // 4

		System.out.println("==================== 이중 연결 리스트 노드 조회 ====================");
		System.out.println("doublyLinkedList search index 2 : " + doublyLinkedList.search(2).getData()); // 3
		System.out.println("doublyLinkedList search index 1 : " + doublyLinkedList.search(1).getData()); // 2

		System.out.println("==================== 이중 연결 리스트 노드 삽입 ====================");
		doublyLinkedList.addNode((E) "5", 1);
		doublyLinkedList.addNode((E) "6", 3);
		doublyLinkedList.addNode((E) "7", 2);
		System.out.println("doublyLinkedList value : " + doublyLinkedList.listValue()); // 1 > 2 > 7 > 3 > 5 > 6 > 4
		System.out.println("doublyLinkedList size : " + doublyLinkedList.size()); // 7
		System.out.println("doublyLinkedList head node : " + doublyLinkedList.getHeadNode().getData()); // 1
		System.out.println("doublyLinkedList tail node : " + doublyLinkedList.getTailNode().getData()); // 4

		System.out.println("==================== 이중 연결 리스트 노드 삭제 ====================");
		doublyLinkedList.removeNode((E) "5");
		doublyLinkedList.removeNode((E) "1");
		doublyLinkedList.removeNode((E) "4");
		System.out.println("doublyLinkedList value : " + doublyLinkedList.listValue()); // 7 > 2 > 6 > 3
		System.out.println("doublyLinkedList size : " + doublyLinkedList.size()); // 4
		System.out.println("doublyLinkedList head node : " + doublyLinkedList.getHeadNode().getData()); // 7
		System.out.println("doublyLinkedList tail node : " + doublyLinkedList.getTailNode().getData()); // 3
	}
}
