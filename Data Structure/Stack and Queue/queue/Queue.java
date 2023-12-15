package org.study.queue;

public class Queue<E> {

    private int tailPointer;

    private int headPointer;

    private E[] arr;

    public Queue(int size) {
        this.tailPointer = 0;
        this.headPointer = 0;
        this.arr = (E[]) new Object[size];
        System.out.println("create new queue array success. array length : [ " + size + " ]");
    }

    /**
     * isFull()
     * <br/>
     * queue가 가득 찼는지 여부 체크
     *
     * @return
     */
    public boolean isFull() {

        return this.headPointer == this.arr.length ? true : false;
    }

    /**
     * add()
     * <br/>
     * 객체를 queue에 저장<br/>
     * 실패 시 예외 발생
     *
     * @param data
     * @return 성공시 true
     * @exception IllegalStateException
     */
    public boolean add(E data) {

        // queue가 가득 찼는지 체크
        if (isFull()) {
            throw new IllegalStateException();
        }

        // headPointer 위치에 객체 추가
        this.arr[this.headPointer] = data;

        // headPointer 한 단계 추가
        headPointer++;

        return true;
    }
}
