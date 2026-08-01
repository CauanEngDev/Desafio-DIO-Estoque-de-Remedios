package com.cauandev.estoqueremedio.repository;

import com.cauandev.estoqueremedio.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
