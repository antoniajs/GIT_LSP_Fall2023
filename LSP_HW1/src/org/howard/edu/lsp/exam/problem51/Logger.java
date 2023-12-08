package org.howard.edu.lsp.exam.problem51;

public class Logger {
	private static Logger instance; //to hold the singleton instance
	private String log;
	
	//constructor is made private to prevent
	//instantiation from outside the class
	private Logger() {
		this.log= "";
	}
	
	//this method gets the instance of the class
	public static synchronized Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}
	
	public void logMessage(String message) {
		this.log += message + "\n";
	}
	
	public String displayLog() {
		return "Log:\n" + log;
	}
}
