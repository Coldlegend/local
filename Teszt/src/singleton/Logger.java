package singleton;

public class Logger {
	private Logger() {

	}

	public static Logger myInstace;

	public static class LoggerHolder {
		public static Logger logger = new Logger();
	}

	public static Logger getInstance() {
		return LoggerHolder.logger;

	}

	public void log(String s) {
		// log implementation
		System.err.println(s);
	}
}
