package collectionsFramework.javaIO;

import java.io.Console;
import java.util.Arrays;

public class Login {
	public static void main(String[] args) {
		Console console = System.console();
		if (console != null) {
			String username = null;
			char[] password = null;
			username = console.readLine("Enter username");
			password = console.readPassword("Enter password: ");
			if (username.equals("scrat") && new String(password).equals("nuts")) {
				console.printf("login successful");

			} else {
				console.printf("restart application and try again");
			}
			Arrays.fill(password, ' ');
		}
	}
}
