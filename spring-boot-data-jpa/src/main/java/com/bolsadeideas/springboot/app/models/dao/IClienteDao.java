package com.bolsadeideas.springboot.app.models.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{

	Cliente findById(Long id);

	void save(Cliente cliente);

	void deleteById(Long id);

	List<Cliente> findAll();


}
