package com.cfe;

import java.time.Instant;
import java.util.TimeZone;

import static com.cfe.Configuration.Language.Spanish;
import static java.util.TimeZone.getTimeZone;

public class Main {
	public static void main(String[] args) {
		Configuration configuration = new Configuration(Spanish, getTimeZone("GMT"));
		System.out.println(configuration.getLanguage());
		System.out.println("Hello world!" + Instant.now());
	}
}
