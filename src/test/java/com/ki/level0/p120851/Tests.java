package com.ki.level0.p120851;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {

    @Test
    @DisplayName("aAb1B2cC34oO => 10")
    void t1(){
        assertThat(new Solution().solution("aAb1B2cC34oO")).isEqualTo(10);
    }
    @Test
    @DisplayName("1a2b3c4d123 => 16")
    void t2(){
        assertThat(new Solution().solution("1a2b3c4d123")).isEqualTo(16);
    }
    @Test
    @DisplayName("1as2f4s3ddsf5sfs9 => 24")
    void t3(){
        assertThat(new Solution().solution("1as2f4s3ddsf5sfs9")).isEqualTo(24);
    }
}
