package com.mati.springbootbackendapirest.repository;

import com.mati.springbootbackendapirest.models.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository<Cliente,Long>{
    
}