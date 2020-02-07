package com.Igor;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if(!deque.contains(num))
                deque.add(num);
        }
        System.out.println(Math.min(deque.size(), m));
        //System.out.println((deque.size()<m) ? deque.size() : m);
        in.close();
    }
}
