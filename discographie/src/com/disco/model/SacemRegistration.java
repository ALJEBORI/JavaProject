package com.disco.model;

import java.util.Date;

public class SacemRegistration {
	private String reference;
	private Date date;
	
	public SacemRegistration(String reference) {
		super();
		this.reference = reference;
		this.date = new Date();
	}
	public SacemRegistration(String reference, Date date) {
		super();
		this.reference = reference;
		this.date = date;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "SacemRegistration [reference=" + reference + ", date=" + date + "]";
	}
	
	
	
}
