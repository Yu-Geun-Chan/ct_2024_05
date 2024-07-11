package com.ki.level1.p12916;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    boolean solution(String s) {
        int leng = s.length();
        int lengP = s.replace("P", "").length();
        int countP = leng - lengP;

        int lengp = s.replace("p", "").length();
        int countp = leng - lengp;

        int lengY = s.replace("Y", "").length();
        int countY = leng - lengY;

        int lengy = s.replace("y", "").length();
        int county = leng - lengy;

        if (countP + countp == countY + county) {
            return true;
        } else return false;
    }
}