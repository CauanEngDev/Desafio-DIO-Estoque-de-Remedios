package com.cauandev.estoqueremedio.service.impl;

import com.cauandev.estoqueremedio.model.*;
import com.cauandev.estoqueremedio.repository.RemedioRepository;
import com.cauandev.estoqueremedio.service.RemedioService;
import com.cauandev.estoqueremedio.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


/**
 * Classe funciona como uma Facade, guardando os subsistemas complexos
 */
@Service
public class RemedioServiceImpl implements RemedioService {
    // Singleton: Autowired funciona exatamente como um Singleton criando uma intância única
    @Autowired
    private RemedioRepository repository;
    @Autowired
    private ViaCepService viaCepService;

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
    public List<TipoRemedio> buscarPorTipo(String tipo) {
        Class<? extends TipoRemedio> classe = escolherClasse(tipo);
        return repository.findAll().stream()
                .filter(classe::isInstance)
                .map(classe::cast)
                .collect(Collectors.toList());
    }

    @Override
    public InfoVenda venderRemedio(Long id, String nome, String cpf, String cep) {
        TipoRemedio remedio = buscarPorId(id);
        InfoVenda venda = remedio.getTarja().processarVenda(remedio, nome, cpf, cep, viaCepService);
        deletar(id);
        return venda;
    }

    public Class<? extends TipoRemedio> escolherClasse(String tipo) {
        switch (tipo.toLowerCase()) {
            case "antigripal" -> {
                return Antigripal.class;
            }
            case "antialergico" -> {
                return Antialergico.class;
            }
            case "analgésico" -> {
                return Analgesico.class;
            }
            case "antibiotico" -> {
                return Antibiotico.class;
            }
            case "antidepressivo" -> {
                return Antidepressivo.class;
            }
            case "antiinflamatório" -> {
                return AntiInflamatorio.class;
            }
            default -> throw new IllegalArgumentException("Tipo de medicamento inválido!");
        }
    }
}
