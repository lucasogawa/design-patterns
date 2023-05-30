package com.ogawalucas.designpattern.servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    private List<Service> listOfServices;

    public Cache() {
        this.listOfServices = new ArrayList<>();
    }

    public Service getService(String jndiName) {
        for (Service service : listOfServices) {
            if (service.getName().equals(jndiName)) {
                return service;
            }
        }

        return null;
    }

    public void addService(Service service) {
        this.listOfServices.add(service);
    }
}
