package circularLinkedList;

public class Main {

	@SuppressWarnings("unchecked")
	public static <E> void main(String[] args) {

		CircularLinkedList<E> singlyLinkedList = new CircularLinkedList<>();
		singlyLinkedList.addNode((E)"1", 0);
		singlyLinkedList.addNode((E)"2", 1);
		singlyLinkedList.addNode((E)"3", 2);
		singlyLinkedList.addNode((E)"4", 3);
		singlyLinkedList.addNode((E)"5", 4);
		System.out.println("==================== 이중 연결 리스트 최초 생성 ====================");
		System.out.println("singlyLinkedList value : " + singlyLinkedList.listValue()); // 1 > 2 > 3 > 4 > 5
		System.out.println("singlyLinkedList size : " + singlyLinkedList.size()); // 5

		System.out.println("==================== 이중 연결 리스트 노드 조회 ====================");
		System.out.println("singlyLinkedList search index 2 : " + singlyLinkedList.search(2).getData()); // 3
		System.out.println("singlyLinkedList search index 4 : " + singlyLinkedList.search(4).getData()); // 5

		System.out.println("==================== 이중 연결 리스트 노드 추가 ====================");
		singlyLinkedList.addNode((E)"6", 0);
		singlyLinkedList.addNode((E)"7", 4);
		System.out.println("singlyLinkedList value : " + singlyLinkedList.listValue()); // 6 > 1 > 2 > 3 > 7 > 4 > 5
		System.out.println("singlyLinkedList size : " + singlyLinkedList.size()); // 7
		
		System.out.println("==================== 이중 연결 리스트 노드 삭제 ====================");
		singlyLinkedList.removeNode((E) "1");
		singlyLinkedList.removeNode((E) "3");
		System.out.println("singlyLinkedList value : " + singlyLinkedList.listValue()); // 6 > 7 > 4 > 5
		System.out.println("singlyLinkedList size : " + singlyLinkedList.size()); // 5
	}
}
