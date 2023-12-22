package org.study.queue;

import java.util.NoSuchElementException;

public class Queue<E> {

    private int tailPointer = 0;

    private int headPointer = 0;

    private E[] arr;

    public Queue(int size) {
        this.tailPointer = 0;
        this.headPointer = 0;
        this.arr = (E[]) new Object[size];
        System.out.println("[Queue 생성 성공] 길이 : " + size);
    }

    /**
     * isFull()
     * <br/>
     * queue가 가득 찼는지 여부 체크
     *
     * @return
     */
    public boolean isFull() {

        if (this.tailPointer == this.headPointer && this.arr[this.headPointer] != null) {
            return true;
        }
        return false;
    }

    /**
     * isEmpty()
     * <br/>
     * queue가 비워져 있는지 여부 체크
     * 
     * @return
     */
    public boolean isEmpty() {

        if (this.tailPointer == this.headPointer && this.arr[this.headPointer] == null) {
            return true;
        }
        return false;
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
            System.out.println("[데이터 저장 실패] queue가 가득 찼습니다. > data : " + data);
            throw new IllegalStateException();
        }

        // tailPointer 위치에 객체 추가
        this.arr[this.tailPointer] = data;

        // tailPointer 한 단계 추가
        this.tailPointer++;
        if (this.tailPointer == this.arr.length) {
            this.tailPointer = 0;
        }

        System.out.println("[데이터 저장 성공] data : " + data);
        return true;
    }

    /**
     * offer()
     * <br/>
     * 객체를 queue에 저장<br/>
     * 실패하더라도 예외 발생하지 않음<br/>
     * 
     * @param data
     * @return 성공시 true, 실패시 false
     */
    public boolean offer(E data) {

        // queue가 가득찼는지 체크
        if (isFull()) {
            System.out.println("[데이터 저장 실패] queue가 가득 찼습니다. > data : " + data);
            return false;
        }

        // tailPointer 위치에 객체 추가
        this.arr[this.tailPointer] = data;

        // tailPointer 한 단계 추가
        this.tailPointer++;
        if (this.tailPointer == this.arr.length) {
            this.tailPointer = 0;
        }

        System.out.println("[데이터 저장 성공] data : " + data);
        return true;
    }

    /**
     * remove()
     * <br/>
     * queue에서 꺼내서 객체 반환<br/>
     * queue가 비워져 있을 경우 예외발생
     * 
     * @return E
     * @exception NoSuchElementException
     */
    public E remove() {

        // queue가 비워져 있는지 체크
        if (isEmpty()) {
            System.out.println("[데이터 반환 실패] queue에 데이터가 존재하지 않습니다");
            throw new NoSuchElementException();
        }

        // headPointer 위치에 객체 꺼냄
        E data = this.arr[this.headPointer];

        // 해당 위치에 객체 삭제
        this.arr[this.headPointer] = null;

        // headPointer 한 단계 추가
        this.headPointer++;
        if (this.headPointer == this.arr.length) {
            this.headPointer = 0;
        }

        System.out.println("[데이터 반환 성공] data : " + data);
        return data;
    }

    /**
     * element()
     * <br/>
     * queue에서 삭제하지 않고 해당 위치 객체 반환<br/>
     * queue가 비워져 있을 경우 예외발생
     * 
     * @return E
     * @exception NoSuchElementException
     */
    public E element() {

        // queue가 비워져 있는지 체크
        if (isEmpty()) {
            System.out.println("[데이터 반환 실패] queue에 데이터가 존재하지 않습니다");
            throw new NoSuchElementException();
        }

        // headPointer 위치에 객체 꺼냄
        E data = this.arr[this.headPointer];

        System.out.println("[데이터 반환 성공] data : " + data);
        return data;
    }

    /**
     * poll()
     * <br/>
     * queue에서 꺼내서 객체 반환<br/>
     * queue가 비워져 있어도 예외발생 안함
     * 
     * @return 실패시 null
     */
    public E poll() {

        // queue가 비워져 있는지 체크
        if (isEmpty()) {
            System.out.println("[데이터 반환 실패] queue에 데이터가 존재하지 않습니다");
            return null;
        }

        // headPointer 위치에 객체 꺼냄
        E data = this.arr[this.headPointer];

        // 해당 위치에 객체 삭제
        this.arr[this.headPointer] = null;

        // headPointer 한 단계 추가
        this.headPointer++;
        if (this.headPointer == this.arr.length) {
            this.headPointer = 0;
        }

        System.out.println("[데이터 반환 성공] data : " + data);
        return data;
    }

    /**
     * peek()
     * <br/>
     * queue에서 삭제하지 않고 해당 위치 객체 반환<br/>
     * queue가 비워져 있어도 예외발생 안함
     * 
     * @return 실패시 null
     */
    public E peek() {

        // queue가 비워져 있는지 체크
        if (isEmpty()) {
            System.out.println("[데이터 반환 실패] queue에 데이터가 존재하지 않습니다");
            return null;
        }

        // headPointer 위치에 객체 꺼냄
        E data = this.arr[this.headPointer];

        System.out.println("[데이터 반환 성공] data : " + data);
        return data;
    }
}