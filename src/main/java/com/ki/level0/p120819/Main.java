package com.ki.level0.p120819;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        for (int i = 1; i <= money; i++) {
                answer[0] = money / 5500;
                answer[1] = money - 5500 * answer[0];
            }
        return answer;
    }
}