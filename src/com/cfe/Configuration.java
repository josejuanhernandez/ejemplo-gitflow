package com.cfe;

import java.util.TimeZone;

public class Configuration {
	private final Language language;
	private final TimeZone timeZone;

	public Configuration(Language language, TimeZone timeZone) {
		this.language = language;
		this.timeZone = timeZone;
	}

	public Language getLanguage() {
		return language;
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public enum Language {
		Spanish, English
	}


}
