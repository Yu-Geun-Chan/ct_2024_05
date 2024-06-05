package com.ki.level0.p120820;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



public class Tests {

    @Test
    @DisplayName("40 => 1983")
    void t1(){
        assertThat(new Solution().solution(40));
    }
    @Test
    @DisplayName("23 => 2000")
    void t2(){
        assertThat(new Solution().solution(23));
    }
    @Test
    @DisplayName("8 => 2014")
    void t3(){
        assertThat(new Solution().solution(8));
    }
}