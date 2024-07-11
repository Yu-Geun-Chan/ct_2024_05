package com.ki.level1.p12912;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public long solution(int a, int b) {
        long sum1 = 0;
        long sum2 = 0;
        if (a - b > 0) {
            long[] arr1 = new long[a - b];
            for (int i = 0; i < a - b; i++) {
                arr1[i] = b + i;
                sum1 += arr1[i];
            }
            sum1 = sum1 + a;
            return sum1;
        }
        if (b - a > 0) {
            long[] arr2 = new long[b - a];
            for (int i = 0; i < b - a; i++) {
                arr2[i] = a + i;
                sum2 += arr2[i];
            }
            sum2 = sum2 + b;
            return sum2;
        } else return a;

    }
}
