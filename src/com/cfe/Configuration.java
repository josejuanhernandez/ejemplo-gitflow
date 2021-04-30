package com.cfe;

public class Configuration {
	private final Language language;

	public Configuration(Language language) {
		this.language = language;
	}

	public Language getLanguage() {
		return language;
	}

	public enum Language {
		Spanish, English
	}


}
