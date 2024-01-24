package afw.manager;

import afw.utils.ConfigFileReader;

public class PropertyManager {

	private static PropertyManager propertyManager = new PropertyManager();
	private static ConfigFileReader configFileReader;

	private PropertyManager() {
	}

	 public static PropertyManager getInstance( ) {
	      return propertyManager;
	 }

	 public ConfigFileReader getConfigReader() {
		 return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	 }
}