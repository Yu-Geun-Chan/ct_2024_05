package com.ki.level1.p12931;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n) {
        String number = String.valueOf(n);
        String[] nBits = number.split("");
        int sum = 0;
        for (int i = 0; i < nBits.length; i++) {
            sum += Integer.parseInt(nBits[i]);
        }
        return sum;
    }
}