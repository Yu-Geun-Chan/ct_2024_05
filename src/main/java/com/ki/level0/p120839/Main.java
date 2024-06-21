package com.ki.level0.p120839;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public String solution(String rsp) {
        String answer = "";
        String rsp2 = "";
        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == '2') {
                rsp2 = "0";
            }
            else if (rsp.charAt(i) == '5') {
                rsp2 = "2";
            }
            else if (rsp.charAt(i) == '0') {
                rsp2 = "5";
            }
            answer += rsp2;
        }
    return answer;
    }
}
