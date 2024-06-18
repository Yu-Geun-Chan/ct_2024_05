package com.ki.level0.p120818;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int price) {
        if (price < 100000) {
            return price;
        }
        else if (price >= 100000 && price < 300000) {
            return (int) (price * 0.95);
        }
        else if (price >= 300000 && price < 500000) {
            return (int) (price * 0.9);
        }
        return (int) (price * 0.8);
    }
}
