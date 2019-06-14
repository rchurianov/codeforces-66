package com.roman;

import java.util.Scanner;

public class RouteToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long counter = 0;
            long l = 0;
            while (n != 0) {
                l = n / k;
                if (l == 0 || l == n) {
                    counter += n;
                    break;
                } else if (n % k == 0) {
                    n = l;
                    ++counter;
                } else {
                    counter += n % k;
                    n -= n % k;
                }
            }
            System.out.println(counter);
        }
    }
}
