package com.SolarPV.SolarPV_webapp.controller;
import com.SolarPV.SolarPV_webapp.model.Client;
import com.SolarPV.SolarPV_webapp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/add")
    public String add(@RequestBody Client client){
        clientService.saveClient(client);
        return "new client is added";
    }
    @GetMapping("/getAll")
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Client> get(@PathVariable Integer id){
        try{
            Client client= clientService.get(id);
            return new ResponseEntity<Client>(client,HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<Client> update(@RequestBody Client client,@PathVariable Integer id){
        try{
            Client existingClient=clientService.get(id);
            clientService.saveClient(client);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (NoSuchElementException e){
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        clientService.delete(id);
        return "Deleted Client with id "+id;
    }

}
