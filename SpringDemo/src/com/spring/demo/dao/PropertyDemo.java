package com.spring.demo.dao;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class PropertyDemo {
	private String[] arrs;
	private List<String> list;
	private Map<String, String> map;
	private Properties properties;
	/**
	 * @return the arrs
	 */
	public String[] getArrs() {
		return arrs;
	}
	/**
	 * @param arrs the arrs to set
	 */
	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}
	/**
	 * @return the list
	 */
	public List<String> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(List<String> list) {
		this.list = list;
	}
	/**
	 * @return the map
	 */
	public Map<String, String> getMap() {
		return map;
	}
	/**
	 * @param map the map to set
	 */
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	/**
	 * @return the properties
	 */
	public Properties getProperties() {
		return properties;
	}
	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
}
