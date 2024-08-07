package com.ki.level1.p12916;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



public class Tests {

    @Test
    @DisplayName("pPoooyY => true")
    void t1(){
        assertThat(new Solution().solution("pPoooyY")).isEqualTo(true);
    }
    @Test
    @DisplayName("Pyy => false")
    void t2(){
        assertThat(new Solution().solution("Pyy")).isEqualTo(false);
    }

    @Test
    @DisplayName("PpyyY => false")
    void t3(){
        assertThat(new Solution().solution("PpyyY")).isEqualTo(false);
    }

    @Test
    @DisplayName("Ppyy => true")
    void t4(){
        assertThat(new Solution().solution("PpyyY")).isEqualTo(true);
    }
}
