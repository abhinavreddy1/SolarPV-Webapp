package com.SolarPV.SolarPV_webapp.service;

import com.SolarPV.SolarPV_webapp.model.Client;

import java.util.List;


public interface ClientService {
    public Client saveClient(Client client);
    public List<Client> getAllClients();
    public Client get(Integer id);
    public void delete(Integer id);

}
