package org.howard.edu.lsp.exam.problem51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestLogger {
	
	@Test
	@DisplayName("Test logging a message")
	public void testDisplayLog() {
		Logger logger = Logger.getInstance();
		logger.logMessage("Test Message");
		assertEquals("Log:\nTest Message\n", logger.displayLog());
	}
	
	@Test
	@DisplayName("Test that multiple instantiations return the same instance")
	public void testLoggerInstances() {
		Logger InstanceOne = Logger.getInstance();
		Logger InstanceTwo = Logger.getInstance();
		assertSame(InstanceOne, InstanceTwo);
	}
}
