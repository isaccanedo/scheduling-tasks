package com.example.demo;
import static org.assertj.core.api.Assertions.assertThat;

import com.example.demo.task.ScheduledTasks;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ScheduletaskApplicationTests {

	@Autowired
	private ScheduledTasks tasks;

	@Test
	public void contextLoads() {
		// Basic integration test that shows the context starts up properly
		assertThat(tasks).isNotNull();
	}

}
