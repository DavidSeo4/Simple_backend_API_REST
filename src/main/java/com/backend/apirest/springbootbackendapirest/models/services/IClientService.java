package com.backend.apirest.springbootbackendapirest.models.services;

import com.backend.apirest.springbootbackendapirest.models.entity.Client;

import java.util.List;
import java.util.Optional;

public interface IClientService {

    public List<Client> findAll();

    public Optional<Client> findById(Long id);

    public Client save(Client client);

    public void deleteClient(Long id);

}
