package com.example.getcachedbeanbug;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void testGetCachedBeanPerformance() {

		for (int i = 0; i < 500000; ++i) {
			applicationContext.getBean(TheBean.class);
		}
	}

}
