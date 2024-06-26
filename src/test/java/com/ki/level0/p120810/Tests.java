package com.ki.level0.p120810;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



public class Tests {

    @Test
    @DisplayName("3, 2 => 1")
    void t1(){
        assertThat(new Solution().solution(3, 2)).isEqualTo(1);
    }
    @Test
    @DisplayName("10, 5 => 0")
    void t2(){
        assertThat(new Solution().solution(10, 5)).isEqualTo(0);
    }
    @Test
    @DisplayName("8, 2 => 0")
    void t3(){
        assertThat(new Solution().solution(8, 2)).isEqualTo(0);
    }
}
