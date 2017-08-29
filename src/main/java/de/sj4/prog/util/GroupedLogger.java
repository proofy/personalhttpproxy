package de.sj4.prog.util;

public class GroupedLogger implements LoggerInterface {
	LoggerInterface[] nestedLoggers;
	
	
	public GroupedLogger(LoggerInterface[] nestedLoggers) {
		this.nestedLoggers=nestedLoggers;
	}


	public void logLine(String txt) {
		for (int i = 0; i <nestedLoggers.length; i++)
			nestedLoggers[i].logLine(txt);
	}


	public void logException(Exception e) {
		for (int i = 0; i <nestedLoggers.length; i++)
			nestedLoggers[i].logException(e);

	}


	public void log(String txt) {
		for (int i = 0; i <nestedLoggers.length; i++)
			nestedLoggers[i].log(txt);

	}


	public void closeLogger() {
		for (int i = 0; i <nestedLoggers.length; i++)
			nestedLoggers[i].closeLogger();
	}

}
