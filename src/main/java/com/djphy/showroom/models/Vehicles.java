package com.djphy.showroom.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String type;
	String model;
	String cost;
	String name;
	
	@ManyToOne
	Dealers dealers;
	
	public static Vehicles toMap(com.djphy.showroom.models.volatilemodel.Vehicles vehicles) {
		return new Vehicles(vehicles.getId(),
				vehicles.getType(),
				vehicles.getModel(),
				vehicles.getCost(),
				vehicles.getName());
	}
	
	public Vehicles() {
		
	}
	
	public Vehicles(int id, String type, String model, String cost, String name) {
		super();
		this.id = id;
		this.type = type;
		this.model = model;
		this.cost = cost;
		this.name = name;
	}


	public Dealers getDealers() {
		return dealers;
	}

	public void setDealers(Dealers dealers) {
		this.dealers = dealers;
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
		return "Vehicles [id=" + id + ", type=" + type + ", model=" + model + ", cost=" + cost + ", name=" + name
				+ ", dealers=" + dealers + "]";
	}
	
	
}
