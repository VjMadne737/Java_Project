package com.Bus.Dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Organization {
	@Id
	private int id;
	private String name;
	private String address;
	@OneToMany
	private List<Bus> listofBus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Bus> getListofBus() {
		return listofBus;
	}
	public void setListofBus(List<Bus> listofBus) {
		this.listofBus = listofBus;
	}
	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", address=" + address + ", listofBus=" + listofBus + "]";
	}
	
	

}
