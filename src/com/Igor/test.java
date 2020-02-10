package com.Igor;

import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer,Integer> uniqInt = new HashMap<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max=0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (uniqInt.containsKey(num)){
                do{
                    int deleteInt = deque.peekFirst();
                    uniqInt.remove(deleteInt);
                }
                while(deque.pollFirst()!=num);
            }
            deque.add(num);
            max = Math.max(max, deque.size());
            uniqInt.put(num,1);
            if (max == m)
                break;
        }
        System.out.println(max);
        in.close();
    }
}