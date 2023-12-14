package org.study.stack;

public class Stack<E> {

    private E[] arr;

    private int pointer;

    public Stack(int size) {
        this.arr = (E[]) new Object[size];
        this.pointer = -1;
    }

    /*
    구현 메소드
    empty(), peek(), pop(), push(Object o), search(Object o)
     */
    public boolean isEmpty() {
        return this.pointer == -1 ? true : false;
    }

    public boolean isFull() {
        return this.pointer + 1 == this.arr.length ? true : false;
    }

    /**
     * push()
     *
     * stack에 데이터 추가.<br/>
     * 실패해도 예외를 발생시키지 않음.<br/>
     * 구현할 때는 실패 시 null을 반환하도록 구현.
     *
     * @param data 추가할 데이터
     * @return 성공 시: data, 실패 시: null
     */
    public E push(E data) {

        // stack이 가득 찼는지 체크
        if (isFull()) {
            return null;
        }

        // 포인터 추가
        this.pointer++;

        // 포인터의 위치에 data를 추가
        this.arr[this.pointer] = data;

        // 추가한 데이터를 반환
        return data;
    }
}
