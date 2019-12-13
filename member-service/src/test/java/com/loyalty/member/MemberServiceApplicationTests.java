package com.loyalty.member;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MemberServiceApplication.class)
class MemberServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void main() {
		MemberServiceApplication.main(new String[] {});
	}

}
