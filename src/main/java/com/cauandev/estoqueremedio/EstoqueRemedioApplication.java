package com.cauandev.estoqueremedio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto de Estoque de Remédios Criado para Realizar Desafio do
 * <b>Santander Bootcamp 2026 Java</b>.
 * <p>
 * Módulos Adicionados:<p>
 *     - OpenAPI<p>
 *     - OpenFeign<p>
 *     - H2 Database<p>
 *     - Spring Web<p>
 *     - Spring Data JPA<p>
 *     - HTTP Clients
 */
@EnableFeignClients
@SpringBootApplication
public class EstoqueRemedioApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstoqueRemedioApplication.class, args);
    }

}
