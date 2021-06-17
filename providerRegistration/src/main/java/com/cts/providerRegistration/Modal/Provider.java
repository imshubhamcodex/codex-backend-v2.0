package com.cts.providerRegistration.Modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import org.springframework.lang.NonNull;

@Entity
public class Provider {

	@Id
	@Column(name = "Provider_id")
	@NonNull
	private int Provider_id;

	@Column(name = "Provider_name")
	@NonNull
	private String Provider_name;

	@Column(name = "Email_id")
	@NonNull
	private String Email_id;

	@Column(name = "Phone_Number")
	@Size(min = 10, max = 10)
	@NonNull
	private String Phone_number;

	@Column(name = "Gender")
	@NonNull
	private char Gender;

	@Column(name = "Organization_id")
	@NonNull
	private int Organization_id;

	public Provider() {
	}

	public Provider(int provider_id, String provider_name, String email_id, String phone_number, char gender,
			int organization_id) {
		Provider_id = provider_id;
		Provider_name = provider_name;
		Email_id = email_id;
		Phone_number = phone_number;
		Gender = gender;
		Organization_id = organization_id;
	}

	public int getProvider_id() {
		return Provider_id;
	}

	public void setProvider_id(int provider_id) {
		Provider_id = provider_id;
	}

	public String getProvider_name() {
		return Provider_name;
	}

	public void setProvider_name(String provider_name) {
		Provider_name = provider_name;
	}

	public String getEmail_id() {
		return Email_id;
	}

	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}

	public String getPhone_number() {
		return Phone_number;
	}

	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}

	public char getGender() {
		return Gender;
	}

	public void setGender(char gender) {
		Gender = gender;
	}

	public int getOrganization_id() {
		return Organization_id;
	}

	public void setOrganization_id(int organization_id) {
		Organization_id = organization_id;
	}

}
