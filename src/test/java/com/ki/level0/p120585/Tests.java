package com.ki.level0.p120585;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {

    @Test
    @DisplayName("[149, 180, 192, 170], 167 => 3")
    void t1() {
        int[] num1 = {149, 180, 192, 170};
        assertThat(new Solution().solution(num1, 167)).isEqualTo(3);
    }
    @Test
    @DisplayName("[180, 120, 140], 190 => 0")
    void t2() {
        int[] num1 = {180, 120, 140};
        assertThat(new Solution().solution(num1, 190)).isEqualTo(0);
    }
    @Test
    @DisplayName("[185, 192, 172, 175], 188 => 1")
    void t3() {
        int[] num1 = {185, 192, 172, 175};
        assertThat(new Solution().solution(num1, 188)).isEqualTo(1);
    }
}