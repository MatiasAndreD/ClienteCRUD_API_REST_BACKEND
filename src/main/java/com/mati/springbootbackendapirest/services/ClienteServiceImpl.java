package com.mati.springbootbackendapirest.services;

import java.util.List;

import com.mati.springbootbackendapirest.models.Cliente;
import com.mati.springbootbackendapirest.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService {

  @Autowired
  private ClienteRepository repository;

  @Override
  @Transactional(readOnly = true)
  public List<Cliente> findAll() {
    return (List<Cliente>) repository.findAll();
  }

  @Override
  public Page<Cliente> findAll(Pageable pageable) {
    return repository.findAll(pageable);
  }


  @Override
  @Transactional(readOnly = true)
  public Cliente findById(Long id) {

    return repository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public Cliente save(Cliente cliente) {
    return repository.save(cliente);
  }

  @Override
  @Transactional
  public void delete(Long id) {

    repository.deleteById(id);

  }



  
    
}