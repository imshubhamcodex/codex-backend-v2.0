package com.cts.providerRegistration.Modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class RateDetails {

	@Id
	private int id;

	@Column(name = "Organization_id")
	@NonNull
	private int organization_id;

	@Column(name = "Service_id")
	@NonNull
	private int Service_id;

	@Column(name = "Rate")
	@NonNull
	private double Rate;

	@Column(name = "Discounted_Rate")
	@NonNull
	private double Discounted_rate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrganization_id() {
		return organization_id;
	}

	public void setOrganization_id(int organization_id) {
		this.organization_id = organization_id;
	}

	public int getService_id() {
		return Service_id;
	}

	public void setService_id(int service_id) {
		Service_id = service_id;
	}

	public double getRate() {
		return Rate;
	}

	public void setRate(double rate) {
		Rate = rate;
	}

	public double getDiscounted_rate() {
		return Discounted_rate;
	}

	public void setDiscounted_rate(double discounted_rate) {
		Discounted_rate = discounted_rate;
	}

	public RateDetails(int id, int organization_id, int service_id, double rate, double discounted_rate) {
		this.id = id;
		this.organization_id = organization_id;
		Service_id = service_id;
		Rate = rate;
		Discounted_rate = discounted_rate;
	}

	public RateDetails() {
	}

}
