package com.cfe;

import java.time.Instant;
import java.util.TimeZone;

import static com.cfe.Configuration.Language.Spanish;
import static java.util.TimeZone.getTimeZone;

public class Main {
	public static void main(String[] args) {
		String fecha = Instant.now().toString().substring(0, 10).replace("-","");
		Configuration configuration = new Configuration(Spanish, getTimeZone("GMT"));
		System.out.println(configuration.getLanguage());
		if (configuration.getLanguage() == Spanish)
			System.out.println("¡Hola mundo! " + fecha);
		else
			System.out.println("Hello world! " + fecha);
	}
}
