package com.Bus.Dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bus {
	@Id
	private int id;
	private int capacity;
	private String type;
	private  double cost ;
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Bus [id=" + id + ", capacity=" + capacity + ", type=" + type + ", cost=" + cost + "]";
	}
	

}
