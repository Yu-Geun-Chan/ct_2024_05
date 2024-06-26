package com.ki.level0.p120583;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {

    @Test
    @DisplayName("[1, 1, 2, 3, 4, 5], 1 => 2")
    void t1() {
        int[] num1 = {1, 1, 2, 3, 4, 5};
        assertThat(new Solution().solution(num1, 1)).isEqualTo(2);
    }
    @Test
    @DisplayName("[0, 2, 3, 4], 1 => 0")
    void t2() {
        int[] num1 = {0, 2, 3, 4};
        assertThat(new Solution().solution(num1, 1)).isEqualTo(0);
    }
    @Test
    @DisplayName("[0, 2, 3, 4, 2], 2 => 1")
    void t3() {
        int[] num1 = {0, 2, 3, 4, 2};
        assertThat(new Solution().solution(num1, 2)).isEqualTo(2);
    }
}