package com.backend.fedibn.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pompe")
public class Pompe {

	@Id
	@GeneratedValue
	private int id;
	private int outflow;
	private String type;
	
	public Pompe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOutflow() {
		return outflow;
	}

	public void setOutflow(int outflow) {
		this.outflow = outflow;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Pompe(int id, int outflow, String type) {
		super();
		this.id = id;
		this.outflow = outflow;
		this.type = type;
	}
}
