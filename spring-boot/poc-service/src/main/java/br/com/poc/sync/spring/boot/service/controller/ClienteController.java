package br.com.poc.sync.spring.boot.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.poc.sync.spring.boot.crud.controller.CrudAbstractController;
import br.com.poc.sync.spring.boot.crud.repository.RepositoryAbstract;
import br.com.poc.sync.spring.boot.service.model.entity.Cliente;
import br.com.poc.sync.spring.boot.service.model.repostiroy.ClienteRepository;

@RestController
@RequestMapping("api/cliente")
public class ClienteController extends CrudAbstractController<Cliente, Integer> {

	@Autowired
	private ClienteRepository repository;

	@Override
	protected RepositoryAbstract<Cliente, Integer> getRepository() {
		return repository;
	}

}
