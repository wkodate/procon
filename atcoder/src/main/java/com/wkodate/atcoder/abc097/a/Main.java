package com.wkodate.atcoder.abc097.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (Math.abs(a - b) <= d && Math.abs(b - c) <= d || Math.abs(c - a) <= d) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
