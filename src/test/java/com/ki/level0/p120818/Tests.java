package com.ki.level0.p120818;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



public class Tests {

    @Test
    @DisplayName("150000 => 142500")
    void t1(){
        assertThat(new Solution().solution(150000)).isEqualTo(142500);
    }
    @Test
    @DisplayName("580000 => 464000")
    void t2(){
        assertThat(new Solution().solution(580000)).isEqualTo(464000);
    }
    @Test
    @DisplayName("300000 => 270000")
    void t3(){
        assertThat(new Solution().solution(300000)).isEqualTo(270000);
    }
}


