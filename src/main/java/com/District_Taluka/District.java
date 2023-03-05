package com.District_Taluka;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class District {
@Id
private int id;
private String name;
@ManyToMany
private List<Taluka> listTaluka;
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
public List<Taluka> getListTaluka() {
	return listTaluka;
}
public void setListTaluka(List<Taluka> listTaluka) {
	this.listTaluka = listTaluka;
}


}
