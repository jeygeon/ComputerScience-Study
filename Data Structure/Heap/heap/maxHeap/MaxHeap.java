package Heap;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {
    private List<Integer> heap;

    public MaxHeap() {

        this.heap = new ArrayList<Integer>();

        // 계산하기 편하게 0번째 index는 더미데이터를 넣는다.
        this.heap.add(0);

        System.out.println("Max Heap 생성 성공");
    }

    public void add(int data) {

        StringBuilder sb = new StringBuilder();

        // heap에 데이터 추가
        this.heap.add(data);
        sb.append("데이터 삽입 : [ " + data + " ]");

        // 새로 삽입된 데이터의 위치 정보
        int index = this.heap.size() - 1;

        // 부모 데이터
        int parentData = this.heap.get(index / 2);

        // 추가한 데이터가 부모 노드 보다 클 경우 위치 재정렬
        if (parentData != 0 && data > parentData) {
            sb.append(" > 부모 노드 보다 큰 데이터가 추가 되었습니다. Heap을 재정렬합니다.");
            System.out.println(sb.toString());
            swap(index);
        } else {
            System.out.println(sb.toString());
        }
    }

    public void swap(int index) {

        int childData;
        int parentData;
        // 루트 노드까지 계속 돌리면서 자식 노드의 데이터가 부모 노드보다 크다면 부모노드와 자식노드 교환
        while(index > 1 && this.heap.get(index) > this.heap.get(index / 2)) {
            childData = this.heap.get(index);
            parentData = this.heap.get(index / 2);
            this.heap.set(index / 2, childData);
            this.heap.set(index, parentData);
            index = index / 2;
            System.out.println("Heap 정렬 완료 : " + this.heap.toString());
        }
    }
}
