package com.dr.framework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map.Entry;
import java.util.Properties;
import com.dr.framework.Configuration;


public final class Configuration {

	private Configuration() {

	}

	private static Properties properties;
	
	

	public static void load() throws IOException {
		properties = new Properties();
		InputStream prop = new FileInputStream(new File("config.properties"));
		BufferedReader reader = new BufferedReader(new InputStreamReader(prop, StandardCharsets.UTF_8));

		try {

			properties.load(reader);

		} finally {
			prop.close();
			reader.close();
		}

	}

	public static String get(String attribute) {

		String value = properties.getProperty(attribute);
		if (value == null) {
			return "";
		}

		return value;
	}
	
	public static void print() {
		for(Entry<Object, Object> entry : properties.entrySet()) {
			System.out.println(String.format("%s=%s", entry.getKey(), entry.getValue()));
		}
	}
	
	public static long timeout() {
		String value = Configuration.get("timeout");
		if(value == null || value.trim().equals("")) {
			return 60L;
		}
		
		return Long.parseLong(value.trim());
	}

}
