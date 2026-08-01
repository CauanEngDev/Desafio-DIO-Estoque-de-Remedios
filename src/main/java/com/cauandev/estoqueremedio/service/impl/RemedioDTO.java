package com.cauandev.estoqueremedio.service.impl;

import com.cauandev.estoqueremedio.model.Formula;
import com.cauandev.estoqueremedio.model.Tarja;

import java.time.LocalDate;

/**
 * Esta classe serve como um armazem de informações que serão usadas pela {@link RemedioFactoryMethod} para
 * criar os remédios.
 */
public class RemedioDTO {
    public record Request(String tipo, String name, LocalDate expedicao, Tarja tarja, Formula formula) { }
}
