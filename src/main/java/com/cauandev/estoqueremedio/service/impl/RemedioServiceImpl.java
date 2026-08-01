package com.cauandev.estoqueremedio.service.impl;

import com.cauandev.estoqueremedio.model.TipoRemedio;
import com.cauandev.estoqueremedio.repository.RemedioRepository;
import com.cauandev.estoqueremedio.service.RemedioService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RemedioServiceImpl implements RemedioService {
    @Autowired
    private RemedioRepository repository;

    @Override
    public void inserir(TipoRemedio remedio) {
        repository.save(remedio);
    }

    @Override
    public void atualizar(Long id, TipoRemedio remedio) {
        Optional<TipoRemedio> remedioDb = repository.findById(id);

        if (remedioDb.isPresent()) repository.save(remedio);
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<TipoRemedio> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public TipoRemedio buscarPorId(Long id) {
        Optional<TipoRemedio> remedio = repository.findById(id);
        return remedio.get();
    }

    @Override
    public <T extends TipoRemedio> List<T> buscarPorTipo(Class<T> tipo) {
        return repository.findAll().stream()
                .filter(tipo::isInstance)
                .map(tipo::cast)
                .collect(Collectors.toList());
    }
}
