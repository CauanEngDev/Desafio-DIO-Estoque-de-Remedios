package com.cauandev.estoqueremedio.service;

import com.cauandev.estoqueremedio.model.InfoVenda;
import com.cauandev.estoqueremedio.model.TipoRemedio;

import java.util.List;

public interface RemedioService {
    void inserir(TipoRemedio remedio);
    void atualizar(Long id, TipoRemedio remedio);
    void deletar(Long id);
    List<TipoRemedio> buscarTodos();
    TipoRemedio buscarPorId(Long id);
    <T extends TipoRemedio> List<T> buscarPorTipo(String tipo);
    InfoVenda venderRemedio(Long id, String nome, String cpf, String cep);
}
