package com.ki.level0.p120831;

public class Main {
    public static void main(String[] args) {




    }
}
class Solution {
    public int solution(int n) {
        int en = 0;
        int sum = 0;
        for (int i = 0; i <= n; i = i + 2) {
            en = i;
            sum += en;
        }
        return sum;
    }
}
