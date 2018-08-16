package com.cg.springframework.organization;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.cg.springframework.add.Address;

public class Organization {
	private String name;
	Address address;
	private double marketValue;
	private LocalDate established;
	private int employeeCount;
	static Set<String> globalPresence; 
	static List<String> boardMembers; 
	static Map<String, String> projectManagers; 
	private Properties proxyServerList; 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getMarketValue() {
		return marketValue;
	}
	public void setMarketValue(double marketValue) {
		this.marketValue = marketValue;
	}
	public LocalDate getEstablished() {
		return established;
	}
	public void setEstablished(String str) {
		String[] date = str.split("/");
		this.established = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
		
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	public static Set<String> getGlobalPresence() {
		return globalPresence;
	}
	public static void setGlobalPresence(Set<String> globalPresence) {
		Organization.globalPresence = globalPresence;
	}
	public static List<String> getBoardMembers() {
		return boardMembers;
	}
	public static void setBoardMembers(List<String> boardMembers) {
		Organization.boardMembers = boardMembers;
	}
	public static Map<String, String> getProjectManagers() {
		return projectManagers;
	}
	public static void setProjectManagers(Map<String, String> projectManagers) {
		Organization.projectManagers = projectManagers;
	}
	public Properties getProxyServerList() {
		return proxyServerList;
	}
	public void setProxyServerList(Properties proxyServerList) {
		this.proxyServerList = proxyServerList;
	}
	@Override
	public String toString() {
		return "Organization [name=" + name + ", address=" + address + ", marketValue=" + marketValue + ", established="
				+ established + ", employeeCount=" + employeeCount + ", proxyServerList=" + proxyServerList + "]";
	}
	
	
}
