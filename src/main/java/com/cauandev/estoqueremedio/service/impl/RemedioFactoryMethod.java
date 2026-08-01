package com.cauandev.estoqueremedio.service.impl;

import com.cauandev.estoqueremedio.model.*;
import org.springframework.stereotype.Component;

/**
 * Classe que implementa o Design Pattern <b>FactoryMethod</b><p>
 * Decide, através do DTO recebido, qual remédio criar e retorna o objeto.
 */
@SuppressWarnings("unchecked")
@Component
public class RemedioFactoryMethod {

    public <T extends TipoRemedio> T fabricarRemedio(RemedioDTO.Request dto) {
        switch (dto.tipo().toLowerCase()) {
            case "antigripal" -> {
                Antigripal remedio = new Antigripal();
                remedio.setName(dto.name());
                remedio.setExpedicao(dto.expedicao());
                remedio.setTarja(dto.tarja());
                remedio.setFormula(dto.formula());

                return (T) remedio;
            }
            case "antialergico" -> {
                Antialergico remedio = new Antialergico();
                remedio.setName(dto.name());
                remedio.setExpedicao(dto.expedicao());
                remedio.setTarja(dto.tarja());
                remedio.setFormula(dto.formula());

                return (T) remedio;
            }
            case "analgésico" -> {
                Analgesico remedio = new Analgesico();
                remedio.setName(dto.name());
                remedio.setExpedicao(dto.expedicao());
                remedio.setTarja(dto.tarja());
                remedio.setFormula(dto.formula());

                return (T) remedio;
            }
            case "antibiotico" -> {
                Antibiotico remedio = new Antibiotico();
                remedio.setName(dto.name());
                remedio.setExpedicao(dto.expedicao());
                remedio.setTarja(dto.tarja());
                remedio.setFormula(dto.formula());

                return (T) remedio;
            }
            case "antidepressivo" -> {
                Antidepressivo remedio = new Antidepressivo();
                remedio.setName(dto.name());
                remedio.setExpedicao(dto.expedicao());
                remedio.setTarja(dto.tarja());
                remedio.setFormula(dto.formula());

                return (T) remedio;
            }
            case "antiinflamatório" -> {
                AntiInflamatorio remedio = new AntiInflamatorio();
                remedio.setName(dto.name());
                remedio.setExpedicao(dto.expedicao());
                remedio.setTarja(dto.tarja());
                remedio.setFormula(dto.formula());

                return (T) remedio;
            }
            default -> throw new IllegalArgumentException("Tipo de medicamento inválido!");
        }
    }
}