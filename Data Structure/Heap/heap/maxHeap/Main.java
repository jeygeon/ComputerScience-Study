package Heap;

public class Main {

    public static void main(String[] args) {

        MaxHeap heap = new MaxHeap();
        heap.add(18);
        heap.add(15);
        heap.add(11);
        heap.add(8);
        heap.add(7);
        heap.add(3);
        heap.add(20);
        /*
        - Max Heap Add 결과
        - 제일 앞 0은 계산을 편하게 하기 위해 넣은 더미데이터이다. 무시 할 것

        Max Heap 생성 성공
        데이터 삽입 : [ 18 ]
        데이터 삽입 : [ 15 ]
        데이터 삽입 : [ 11 ]
        데이터 삽입 : [ 8 ]
        데이터 삽입 : [ 7 ]
        데이터 삽입 : [ 3 ]
        데이터 삽입 : [ 20 ] > 부모 노드 보다 큰 데이터가 추가 되었습니다. Heap을 재정렬합니다.
        Heap 정렬 완료 : [0, 18, 15, 20, 8, 7, 3, 11]
        Heap 정렬 완료 : [0, 20, 15, 18, 8, 7, 3, 11]
         */

    }
}
