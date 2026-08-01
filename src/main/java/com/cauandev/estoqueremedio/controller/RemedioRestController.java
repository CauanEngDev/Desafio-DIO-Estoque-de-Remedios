package com.cauandev.estoqueremedio.controller;

import com.cauandev.estoqueremedio.model.InfoVenda;
import com.cauandev.estoqueremedio.model.TipoRemedio;
import com.cauandev.estoqueremedio.service.RemedioService;
import com.cauandev.estoqueremedio.service.impl.RemedioDTO;
import com.cauandev.estoqueremedio.service.impl.RemedioFactoryMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Facade do projeto, chama e retorna apenas o necessário, matendo os subsitemas escondidos.
 */
@RestController
@RequestMapping("remedios")
public class RemedioRestController {
    @Autowired
    private RemedioService service;
    @Autowired
    private RemedioFactoryMethod factoryMethod;

    @GetMapping
    public ResponseEntity<List<TipoRemedio>> buscarTodos() {
        return ResponseEntity.ok(service.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoRemedio> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @GetMapping("/tipo/{tipo}")
    public ResponseEntity<List<TipoRemedio>> buscarPorTipo(@PathVariable String tipo) {
        return ResponseEntity.ok(service.buscarPorTipo(tipo));
    }

    @PostMapping
    public ResponseEntity<TipoRemedio> inserir(@RequestBody RemedioDTO.Request dto) {
        TipoRemedio remedio = factoryMethod.fabricarRemedio(dto);
        service.inserir(remedio);
        return ResponseEntity.ok(remedio);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoRemedio> atualizar(@PathVariable Long id, @RequestBody TipoRemedio remedio) {
        service.atualizar(id, remedio);
        return ResponseEntity.ok(remedio);
    }

    @PostMapping("/vender/{id}")
    public ResponseEntity<InfoVenda> venderProduto(@PathVariable Long id, String nome, String cpf, String cep) {
        InfoVenda venda = service.venderRemedio(id, nome, cpf, cep);
        return ResponseEntity.ok(venda);
    }
}
