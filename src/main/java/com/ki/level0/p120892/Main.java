package com.ki.level0.p120892;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int num = code;
        for(; code <= cipher.length(); code += num) {
            answer += cipher.charAt(code - 1);
        }
        return answer;
    }
}
