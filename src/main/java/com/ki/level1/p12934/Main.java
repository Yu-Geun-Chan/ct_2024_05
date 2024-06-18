package com.ki.level1.p12934;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public long solution(long n) {
        double a = 0;
        for (int i = 1; i <= n; i++) {
            if (i % Math.sqrt(i) == 0) {
                a = Math.pow((Math.sqrt(i) + 1), 2);
                return (long) a;
            }
        }
        return -1;
    }
}