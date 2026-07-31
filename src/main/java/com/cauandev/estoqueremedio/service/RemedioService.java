package com.cauandev.estoqueremedio.service;

import com.cauandev.estoqueremedio.model.TipoRemedio;

import java.util.List;

public interface RemedioService {
    void inserir(TipoRemedio remedio);
    void atualizar(Long id, TipoRemedio remedio);
    void deletar(Long id);
    Iterable<TipoRemedio> buscarTodos();
    TipoRemedio buscarPorId(Long id);
    <T extends TipoRemedio> List<T> buscarPorTipo(Class<T> tipo);
}
