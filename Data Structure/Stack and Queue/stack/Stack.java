package org.study.stack;

import java.util.EmptyStackException;

public class Stack<E> {

    private E[] arr;

    private int pointer;

    public Stack(int size) {
        this.arr = (E[]) new Object[size];
        this.pointer = -1;
        System.out.println("create new stack array success. array length : [ " + size + " ]");
    }

    /**
     * isEmpty()
     * <br/>
     * stack이 비워져있는지 여부 체크
     *
     * @return
     */
    public boolean isEmpty() {
        return this.pointer == -1 ? true : false;
    }

    /**
     * isFull()
     * <br/>
     * stack이 가득 찼는지 여부 체크
     *
     * @return
     */
    public boolean isFull() {
        return this.pointer + 1 == this.arr.length ? true : false;
    }

    /**
     * push()
     * <br/>
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
            System.out.println("can't push data [ " + data + " ]. stack length is full");
            return null;
        }

        // 포인터 추가
        this.pointer++;

        // 포인터의 위치에 data를 추가
        this.arr[this.pointer] = data;

        // 추가한 데이터를 반환
        return data;
    }

    /**
     * search()
     * <br/>
     * Stack에서 객체를 찾아서 그 위치를 반환<br/>
     * 실패해도 예외를 발생시키지 않음.<br/>
     *
     * @param data 위치를 찾을 데이터 데이터
     * @return 못 찾으면 -1을 반환
     */
    public int search(E data) {

        // stack이 비어있는지 확인
        if (isEmpty()) {
            System.out.println("can't find data [ " + data + " ]. stack length is zero");
            return -1;
        }

        // stack의 제일 첫번째부터 for문으로 데이터 찾기
        E target;
        for (int i = 0; i < this.arr.length; i++) {
            target = this.arr[i];
            if (target.equals(data)) {
                return i + 1;
            }
        }

        // 못 찾으면 -1을 반환
        return -1;
    }

    /**
     * peek()
     * <br/>
     * stack의 객체를 반환<br/>
     * stack에서 객체를 꺼내지 않음<br/>
     *
     * @return E data
     * @exception EmptyStackException
     */
    public E peek() {

        // stack이 비워져 있는지 체크
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return this.arr[this.pointer];
    }

    /**
     * pop()
     * <br/>
     * stack의 객체를 반환<br/>
     * stack에서 객체를 꺼냄
     *
     * @return E data
     * @exception EmptyStackException
     */
    public E pop() {

        // stack이 비워져 있는지 체크
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        E targetData = this.arr[this.pointer];

        // 현재 포인터 객체 초기화
        this.arr[this.pointer] = null;

        // 포인터 한단계 낮춤
        this.pointer--;

        return targetData;
    }
}
