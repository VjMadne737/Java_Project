package com.District_Taluka;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Taluka {
	@Id
	private int id;
	private String tname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Taluka [id=" + id + ", tname=" + tname + "]";
	}
	

}
