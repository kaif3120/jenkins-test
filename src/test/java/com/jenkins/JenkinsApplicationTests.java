package com.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {

	 @Test
	 void test1() {
       assertEquals(true ,2+2 == 4);
	}
	 @Test
	 void test2() {
	    assertEquals(false ,2+2 == 5 );
	}

}
