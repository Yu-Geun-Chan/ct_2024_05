package com.ki.level0.p120831;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



public class Tests {

    @Test
    @DisplayName("10 => 30")
    void t1(){
        assertThat(new Solution().solution(10));
    }
    @Test
    @DisplayName("4 => 6")
    void t2(){
        assertThat(new Solution().solution(4));
    }
    @Test
    @DisplayName("2 => 2")
    void t3(){
        assertThat(new Solution().solution(2));
    }
}