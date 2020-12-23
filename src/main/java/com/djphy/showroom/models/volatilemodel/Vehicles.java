package com.djphy.showroom.models.volatilemodel;


public class Vehicles {

	int id;
	int dealer_Id;
	String type;
	String model;
	String cost;
	String name;
	
	public int getDealer_Id() {
		return dealer_Id;
	}
	public void setDealer_Id(int dealer_Id) {
		this.dealer_Id = dealer_Id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Vehicles [id=" + id + ", dealer_Id=" + dealer_Id + ", type=" + type + ", model=" + model + ", cost="
				+ cost + ", name=" + name + "]";
	}
	
	
}
