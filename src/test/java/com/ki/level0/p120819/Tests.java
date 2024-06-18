package com.ki.level0.p120819;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {

    @Test
    @DisplayName("5500 => [1, 0]")
    void t1(){
        int[] a = {1, 0};
        assertThat(new Solution().solution(5500)).isEqualTo(a);
    }
    @Test
    @DisplayName("15,000 => [2, 4000]")
    void t2(){
        int[] a = {2, 4000};
        assertThat(new Solution().solution(15000)).isEqualTo(a);
    }
    @Test
    @DisplayName("27000 => [4, 5000]")
    void t3(){
        int[] a = {4, 5000};
        assertThat(new Solution().solution(27000)).isEqualTo(a);
    }
}