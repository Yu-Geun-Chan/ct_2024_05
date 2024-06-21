package com.ki.level1.p12921;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    static int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrimeNumber(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean isPrimeNumber(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}