package com.cts.providerRegistration.Modal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class Organization {
    
    @Id
    @Column(name = "Organization_id")
    @NonNull
    private int organization_id;

    @Column(name = "Organization_name")
    @NonNull
    private String organization_name;

    @Column(name = "Organization_location")
    @NonNull
    private String organization_location;

   
    public int getOrganization_id() {
        return organization_id;
    }


    public Organization(int organization_id, String organization_name, String organization_location) {
        this.organization_id = organization_id;
        this.organization_name = organization_name;
        this.organization_location = organization_location;
    }


    public void setOrganization_id(int organization_id) {
        this.organization_id = organization_id;
    }


    public String getOrganization_name() {
        return organization_name;
    }


    public void setOrganization_name(String organization_name) {
        this.organization_name = organization_name;
    }


    public String getOrganization_location() {
        return organization_location;
    }


    public void setOrganization_location(String organization_location) {
        this.organization_location = organization_location;
    }


    public Organization() {
    }

    

}
