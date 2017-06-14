package javaIO;

import java.io.Console;

public class consoleEcho {
	public static void main(String[] args) {
		// get the system object
		Console console = System.console();
		if (console == null) {
			System.err.println("Cannot retrieve console object - are you running your application from IDE? exiting..");
			System.exit(-1);
		}
		// read a line and print it through printf
		console.printf(console.readLine());
	}
}
