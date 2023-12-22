package com.backend.apirest.springbootbackendapirest.models.dao;
import com.backend.apirest.springbootbackendapirest.models.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientDao extends JpaRepository<Client, Long> {
}
