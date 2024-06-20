package com.ki.level0.p120851;


public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]", "");
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
        }
        return answer;

    }
}