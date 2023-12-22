package org.study.queue;

public class Main {

    public static <E> void main(String[] args) {

        Queue<E> queue = new Queue<>(5);

        // 데이터 저장
        queue.offer((E) "1");
        queue.offer((E) "2");
        queue.offer((E) "3");
        queue.offer((E) "4");

        // 데이터 삭제
        queue.poll();
        queue.poll();

        // 데이터 저장
        queue.offer((E) "5");
        queue.offer((E) "6");
        queue.offer((E) "7");
        queue.offer((E) "8");

        // 데이터 삭제
        queue.poll();

        // 데이터 저장
        queue.offer((E) "8");
    }
}