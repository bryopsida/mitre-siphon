package xyz.andrewkboyd.mitresiphon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the spring boot application
 */
@SpringBootApplication
public class MitreSiphonApplication {

	/**
	 * Launch the spring application
	 * @param args passed to SpringApplication.run
	 */
	public static void main(String[] args) {
		try {
			SpringApplication.run(MitreSiphonApplication.class, args);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
