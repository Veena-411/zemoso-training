package com.springboot.assignment;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;


@SpringBootTest
class AssignmentApplicationTest {

	@Test
	void contextLoads() {
		AssignmentApplication.main(new String[]{});
		String actual = "test";
		String expected = "test";
		assertEquals(expected,actual);
	}

}
