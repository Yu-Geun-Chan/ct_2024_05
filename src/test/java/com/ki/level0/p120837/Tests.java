package com.ki.level0.p120837;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {

    @Test
    @DisplayName("23 => 5")
    void t1() {
        assertThat(new Solution().solution(23)).isEqualTo(5);
    }
    @Test
    @DisplayName("24 => 6")
    void t2() {
        assertThat(new Solution().solution(24)).isEqualTo(6);
    }
    @Test
    @DisplayName("999 => 201")
    void t3() {
        assertThat(new Solution().solution(999)).isEqualTo(201);
    }
    @Test
    @DisplayName("28 => 6")
    void t4() {
        assertThat(new Solution().solution(28)).isEqualTo(6);
    }
    @Test
    @DisplayName("125 => 25")
    void t5() {
        assertThat(new Solution().solution(125)).isEqualTo(25);
    }
    @Test
    @DisplayName("129 => 27")
    void t6() {
        assertThat(new Solution().solution(129)).isEqualTo(27);
    }

}






