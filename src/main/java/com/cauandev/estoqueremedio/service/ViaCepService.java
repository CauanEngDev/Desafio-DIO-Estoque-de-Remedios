package com.cauandev.Lab_Padroes_de_Projetos_Spring.service;

import com.cauandev.Lab_Padroes_de_Projetos_Spring.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Cliente HTTP, criado via <b>OpenFeign</b>, para o consumo da API do
 * <b>ViaCep</b>
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    @RequestMapping(method = RequestMethod.GET, value = "{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
