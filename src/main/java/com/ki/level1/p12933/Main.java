package com.ki.level1.p12933;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public long solution(long n) {
        String number = String.valueOf(n);
        String[] nBits = number.split("");
        int[] nBitsNum = new int[nBits.length];
        int[] nBitsNumDesc = new int[nBits.length];

        for (int i = 0; i < nBits.length; i++) {
            nBitsNum[i] = Integer.parseInt(nBits[i]);
        }
        Integer[] tmpInts = Arrays.stream(nBitsNum).boxed().toArray(Integer[]::new);
        Arrays.sort(tmpInts, (a, b) -> b - a);

        String numberDescStr = "";
        for (int i = 0; i < tmpInts.length; i++) {
            numberDescStr += String.valueOf(tmpInts[i]);
        }
        long numberDesc = Long.parseLong(numberDescStr);

        return numberDesc;
    }
}
