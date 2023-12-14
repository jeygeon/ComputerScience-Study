package org.study.stack;

import java.sql.Array;

public class Main {
    public static <E> void main(String[] args) {

        Stack<E> stack = new Stack<E>(3);
        int index1 = stack.search((E) "3");
        System.out.println("Stack data [ 3 ] index is " + index1);
        E data1 = stack.push((E) "1");
        if (data1 != null) {
            System.out.println("Stack data [ " + data1 + " ] push success");
        }
        E data2 = stack.push((E) "2");
        if (data2 != null) {
            System.out.println("Stack data [ " + data2 + " ] push success");
        }
        E data3 = stack.push((E) "3");
        if (data3 != null) {
            System.out.println("Stack data [ " + data3 + " ] push success");
        }
        E data4 = stack.push((E) "4");
        if (data4 != null) {
            System.out.println("Stack data [ " + data4 + " ] push success");
        }
        int index2 = stack.search((E) "3");
        System.out.println("Stack data [ 3 ] index is " + index2);

        E peekData1 = stack.peek();
        System.out.println("stack peek data is [ " + peekData1 + " ]");

        E popData = stack.pop();
        System.out.println("stack pop data is [ " + popData + " ]");

        E peekData2 = stack.peek();
        System.out.println("stack peek data is [ " + peekData2 + " ]");

    }

}