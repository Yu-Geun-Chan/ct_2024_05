package com.ki.level0.p120814;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int solution(int n) {
        if (n % 7 == 0) {
            return n / 7;
        }
        else {
            return n / 7 + 1;
        }

    }
}
