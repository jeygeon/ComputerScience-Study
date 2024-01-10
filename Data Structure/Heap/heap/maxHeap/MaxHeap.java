package Heap;

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
 
            int childData;
            // 루트 노드까지 계속 돌리면서 자식 노드의 데이터가 부모 노드보다 크다면 부모노드와 자식노드 교환
            while(index > 1 && this.heap.get(index) > this.heap.get(index / 2)) {
                childData = this.heap.get(index);
                parentData = this.heap.get(index / 2);
                this.heap.set(index / 2, childData);
                this.heap.set(index, parentData);
                index = index / 2;
                System.out.println("Heap 정렬 완료 : " + this.heap.toString());
            }
        } else {
            System.out.println(sb.toString());
        }
    }

    public void remove() {

        // 가장 마지막에 추가된 노드를 루트 노드로 지정
        int lastNodeIndex = this.heap.size() - 1;
        this.heap.set(1, this.heap.get(lastNodeIndex));

        // 가장 마지막에 추가된 노드 자리 데이터 삭제
        this.heap.remove(lastNodeIndex);
        System.out.println("Heap 최대값 노드 삭제 완료 : " + this.heap.toString());

        // 현재 index노드(root부터 시작)가 오른쪽 자식노드 또는 왼쪽 자식노드보다 크면 종료한다.
        int index = 1;
        int targetData;
        int leftChildData;
        int rightChildData;
        int biggerChildData;
        boolean isLeftChildBigger = true;
        int test1 = this.heap.get(index);
        int test2 = this.heap.get(index * 2);
        int test3 = this.heap.get(index * 2 + 1);
        while (this.heap.get(index) < this.heap.get(index * 2) || this.heap.get(index) < this.heap.get(index * 2 + 1)) {
            targetData = this.heap.get(index);
            leftChildData = this.heap.get(index * 2);
            rightChildData = this.heap.get(index * 2 + 1);

            // leftChildData와 rightChildData를 비교하여 더 큰 childData와 targetData를 비교
            if (leftChildData > rightChildData) {
                biggerChildData = leftChildData;
                isLeftChildBigger = true;
            } else {
                biggerChildData = rightChildData;
                isLeftChildBigger = false;
            }

            // targetData가 자식 노드보다 더 크면 while문 종료
            if (targetData > biggerChildData) {
            	System.out.println("Heap 정렬 완료 : " + this.heap.toString());
                break;
            }

            // targetData의 leftChildData가 더 큰 경우 targetData와 leftChildData 교환 > index는 leftChildData자리의 index로 설정
            if (targetData < biggerChildData && isLeftChildBigger) {
                this.heap.set(index, leftChildData);
                this.heap.set(index * 2, targetData);
                index = index * 2;
                System.out.println("Heap 정렬 완료 : " + this.heap.toString());
            }

            // targetData의 rightChildData가 더 큰 경우 targetData와 rightChildData 교환 > index는 rightChildData자리의 index로 설정
            if (targetData < biggerChildData && !isLeftChildBigger) {
                this.heap.set(index, rightChildData);
                this.heap.set(index * 2 + 1, targetData);
                index = index * 2 + 1;
                System.out.println("Heap 정렬 완료 : " + this.heap.toString());
                
                // 다음 비교 할 대상이 왼쪽 자식밖에 없는 경우
                if (index == this.heap.size()) {
                    
                }
            }
        }
    }
}
