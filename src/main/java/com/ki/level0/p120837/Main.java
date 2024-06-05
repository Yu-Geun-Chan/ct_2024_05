package com.ki.level0.p120837;

public class Main {
    public static void main(String[] args) {

//        hp	result
//        23	5
//        24	6
//        999	201

    }
}

class Solution {
    public int solution(int hp) {
        return hp / 5 + hp % 5 / 3 + hp % 5 % 3;
    }
}