package com.hust.edu.pojo;

public class Airport {
	private int id;
	private String portName;
	private String cityName;

	public Airport(String portName, String cityName) {
		this.portName = portName;
		this.cityName = cityName;
	}

	public Airport(int id, String portName, String cityName) {
		this.id = id;
		this.portName = portName;
		this.cityName = cityName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPortName() {
		return portName;
	}

	public void setPortName(String portName) {
		this.portName = portName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Airport{" +
				"id=" + id +
				", portName='" + portName + '\'' +
				", cityName='" + cityName + '\'' +
				'}';
	}
}
