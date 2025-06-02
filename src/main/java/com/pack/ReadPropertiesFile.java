package com.pack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties pt = new Properties();
		
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\config.properties\\");
		
		pt.load(fi); // load the properties file
		
		//Read the data from properties file
		String url = pt.getProperty("appurl");
		String usrname = pt.getProperty("username");
		String password = pt.getProperty("password");
		
		System.out.println(url+" "+usrname+" "+password);
		
		// read all the keys from properties file
		Set<String> keys = pt.stringPropertyNames();
		System.out.println(keys);
		
		      // OR //
		
		Set<Object> key1 = pt.keySet();
		System.out.println(key1);
		
		// read all the values from properties file
		Collection<Object> values = pt.values();
		System.out.println(values);

		fi.close(); 
	}

}
