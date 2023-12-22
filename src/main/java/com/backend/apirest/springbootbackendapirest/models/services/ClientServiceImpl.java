package com.backend.apirest.springbootbackendapirest.models.services;
import com.backend.apirest.springbootbackendapirest.models.dao.IClientDao;
import com.backend.apirest.springbootbackendapirest.models.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements IClientService{

    @Autowired
    private IClientDao iClientDao;
    @Override
    @Transactional(readOnly = true)
    public List<Client> findAll() {
        return iClientDao.findAll();
    }

    @Override
    public Optional<Client> findById(Long id) {
        return iClientDao.findById(id);
    }

    @Override
    public Client save(Client client) {
        return iClientDao.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        iClientDao.deleteById(id);
    }



}
