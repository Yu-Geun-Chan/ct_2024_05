package com.ki.level0.p120893;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int number, int n, int m) {
        if (number % n == 0 && number % m == 0) {
            return 1;
        } else return 0;
    }
}
