package com.ki.level1.p12932;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int[] solution(long n) {
        String number = String.valueOf(n);
        String[] nBits = number.split("");
        int[] answer = new int[nBits.length];

        for (int i = 0; i < nBits.length; i++) {
            answer[i] += Integer.parseInt(nBits[nBits.length - 1 - i]);
        }
        return answer;
    }
}