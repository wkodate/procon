package com.wkodate.atcoder.abc098.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.max(a + b, Math.max(a - b, a * b)));
    }

}
