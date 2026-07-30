package com.cauandev.estoqueremedio.repository;

import com.cauandev.estoqueremedio.model.Analgesico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalgesicoRepository extends CrudRepository<Analgesico, Long> {
}
