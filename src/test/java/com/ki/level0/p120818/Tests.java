package com.ki.level0.p120818;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



public class Tests {

    @Test
    @DisplayName("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10] => 5.5")
    void t1(){
        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(new Solution().solution(num1)).isEqualTo(5.5);
    }
    @Test
    @DisplayName("[89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99] => 94.0")
    void t2(){
        int[] num1 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        assertThat(new Solution().solution(num1)).isEqualTo(94.0);
    }
    @Test
    @DisplayName("80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90 => 85.0")
    void t3(){
        int[] num1 = {80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
        assertThat(new Solution().solution(num1)).isEqualTo(85.0);
    }
}

