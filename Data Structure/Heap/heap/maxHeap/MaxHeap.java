package Heap;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap<E> {
    private List<E> heap;

    public MaxHeap() {
        this.heap = new ArrayList<>();
        System.out.println("max heap 생성 성공");
    }

    public void add(E data) {
        this.heap.add(data);
    }



}
