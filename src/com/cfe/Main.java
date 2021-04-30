package com.cfe;

import java.time.Instant;

public class Main {
	public static void main(String[] args) {
		String fecha = Instant.now().toString().substring(0, 10);
		System.out.println("Hello world! " + fecha);
		System.out.println("¡Hola mundo! " + fecha);
	}
}
