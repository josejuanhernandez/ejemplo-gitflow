package com.cfe;

import java.time.Instant;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world! " + Instant.now().toString().substring(0, 10));
	}
}
