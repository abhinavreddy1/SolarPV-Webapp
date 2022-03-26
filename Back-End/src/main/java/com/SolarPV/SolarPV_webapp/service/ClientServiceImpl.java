package com.SolarPV.SolarPV_webapp.service;

import com.SolarPV.SolarPV_webapp.model.Client;
import com.SolarPV.SolarPV_webapp.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepo clientRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);


    }

    @Override
    public Client get(Integer id) {
        return clientRepository.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        clientRepository.deleteById(id);
    }
}
