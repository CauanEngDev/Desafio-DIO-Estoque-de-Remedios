package com.cauandev.estoqueremedio.repository;

import com.cauandev.estoqueremedio.model.Antigripal;
import com.cauandev.estoqueremedio.model.TipoRemedio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemedioRepository extends JpaRepository<TipoRemedio, Long> {
}
