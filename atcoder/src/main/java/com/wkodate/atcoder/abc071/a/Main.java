package com.wkodate.atcoder.abc071.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(x - a) < Math.abs(x - b)) {
            System.out.println("A");
            return;
        }
        System.out.println("B");
    }

}
