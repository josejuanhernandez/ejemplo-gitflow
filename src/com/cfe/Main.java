package com.cfe;

import java.time.Instant;

public class Main {
	public static void main(String[] args) {
		String fecha = Instant.now().toString().substring(0, 10).replace("-","");
		System.out.println("Hello world! " + fecha);
	}
}
