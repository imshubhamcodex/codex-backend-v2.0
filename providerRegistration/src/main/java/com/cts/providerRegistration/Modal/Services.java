package com.cts.providerRegistration.Modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Services {

    @Id
    @Column(name = "Service_Id")
    @NotNull
    private Integer Service_Id;

    @Column(name = "Service_Name")
    @NotNull
    private String Service_Name;


    public Services(){
        
    }


    public Integer getService_Id() {
        return Service_Id;
    }


    public void setService_Id(Integer service_Id) {
        Service_Id = service_Id;
    }


    public String getService_Name() {
        return Service_Name;
    }


    public void setService_Name(String service_Name) {
        Service_Name = service_Name;
    }


    public Services(Integer service_Id, String service_Name) {
        Service_Id = service_Id;
        Service_Name = service_Name;
    }

    

    
   
}
