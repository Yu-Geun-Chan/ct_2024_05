package com.ki.level0.p120804;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//        System.out.println(new Solution().solution(2, 3)); // -1
//        System.out.println(new Solution().solution(11, 11)); // 1
//        System.out.println(new Solution().solution(7, 99)); // -1

public class Tests {

    @Test
    @DisplayName("3, 4 => 12")
    void t1(){
        assertThat(new Solution().solution(3, 4)).isEqualTo(12);
    }
    @Test
    @DisplayName("27, 19 => 513")
    void t2(){
        assertThat(new Solution().solution(27, 19)).isEqualTo(513);
    }
    @Test
    @DisplayName("2, 8 => 16")
    void t3(){
        assertThat(new Solution().solution(2, 8)).isEqualTo(16);
    }
}

