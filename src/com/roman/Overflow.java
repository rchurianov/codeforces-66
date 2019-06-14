package com.roman;

import java.util.Scanner;

public class Overflow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = 0;
        for (int i = 0; i < n; ++i) {
            Cycle(sc);
        }
    }

    private static void Cycle(Scanner sc) {
        String line = sc.nextLine();
        // or use recursion
        if (line.contains("for")) {
            String[] tokens = line.split(" ");
            int m = Integer.getInteger(tokens[1]);
            for (int j = 0; j < m; ++j) {
                // recursions call
                Cycle(sc);
                // how to specify bottom out case
            }
        }
    }
}
