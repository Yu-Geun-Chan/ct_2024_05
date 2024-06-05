package com.ki.level0.p120817;

public class Main {
    public static void main(String[] args) {


    }
}
class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        answer = sum;
        return answer / numbers.length;
    }
}