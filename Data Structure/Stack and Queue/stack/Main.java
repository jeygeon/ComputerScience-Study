package org.study.stack;

import java.sql.Array;

public class Main {
    public static <E> void main(String[] args) {

        Stack<E> stack = new Stack<E>(3);
        E data = stack.push((E) "1");
        if (data != null) {
            System.out.println("Stack 데이터 삽입 성공 : " + data);
        }


    }

}