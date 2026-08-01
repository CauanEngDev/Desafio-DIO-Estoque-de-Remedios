package com.cauandev.estoqueremedio.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;

import java.time.LocalDate;

@MappedSuperclass
public abstract class TipoRemedio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long code;
    private String name;
    private LocalDate expedicao;
    private Tarja tarja;
    private Formula formula;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpedicao() {
        return expedicao;
    }

    public void setExpedicao(LocalDate expedicao) {
        this.expedicao = expedicao;
    }

    public Tarja getTarja() {
        return tarja;
    }

    public void setTarja(Tarja tarja) {
        this.tarja = tarja;
    }

    public Formula getFormula() {
        return formula;
    }

    public void setFormula(Formula formula) {
        this.formula = formula;
    }
}
