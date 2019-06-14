package com.roman;

import java.util.Scanner;

public class Overflow {

    /*
    Notes:
    Boundaries:
    x in [0, 2^32 - 1]

    int type: [ -2^32, 2^32 - 1 ]
    x should fit in integer type
    thus we can catch java Exception on integer overflow
    or just hardcode a constant and compare current value with it
    or we can use an existing constant from Integer wrapper class
    2^32 = 4294967296
    2^32 - 1 = 4294967296 - 1

    initial value
    x = 0

    add
    ++x

    for 35
    end
     */

    private int maximum_integer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        while (sc.hasNext()) {
            x = Cycle(sc, x);
        }
        System.out.println(x);
    }

    private static int Cycle(Scanner sc, int x) {
        String line = sc.nextLine();

        // bottom case
        if (line.equals("end")) {
            return x;
        }

        if (line.equals("add")) {
            ++x;
        }

        // or use recursion
        if (line.contains("for")) {
            String[] tokens = line.split(" ");
            int m = Integer.parseInt(tokens[1]);
            for (int j = 0; j < m; ++j) {
                x = Cycle(sc, x);
            }
        }

        return x;
    }
}
