package com.oneto.manymapping.annotation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ans5991")
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;

	private String answeName;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAnsweName() {
		return answeName;
	}

	public void setAnsweName(String answeName) {
		this.answeName = answeName;
	}

}
