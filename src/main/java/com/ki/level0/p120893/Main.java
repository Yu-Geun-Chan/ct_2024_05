package com.ki.level0.p120893;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            } else {
                c = (char) (c + 32);
            }
            answer = answer + c;
        }
        return answer;
    }
}
