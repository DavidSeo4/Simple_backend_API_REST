package com.backend.apirest.springbootbackendapirest.controllers;

import com.backend.apirest.springbootbackendapirest.models.entity.Client;
import com.backend.apirest.springbootbackendapirest.models.services.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/")
public class ClientController {
    @Autowired
    private ClientServiceImpl clientService;

    @GetMapping("/clients")
    private List<Client> getAllClients(){
      return clientService.findAll();
    }

    @GetMapping("/clients/{id}")
    private Optional<Client> getClient(@PathVariable Long id){
        return clientService.findById(id);
    }

    @PostMapping("clients/new")
    private Client addClient(@RequestBody Client client){
        return clientService.save(client);
    }
    @DeleteMapping("clients/delete/{id}")
    private void deleteClient(@PathVariable Long id){
        clientService.deleteClient(id);
    }

    @PutMapping("clients/update/{id}")
    private Client updateClient(@RequestBody Client client, @PathVariable Long id){
        Optional<Client> clientAux = clientService.findById(id);
        clientAux.get().setName(client.getName());
        clientAux.get().setSurname(client.getSurname());
        clientAux.get().setEmail(client.getEmail());
        return clientService.save(clientAux.get());
    }

}
