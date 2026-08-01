package com.cauandev.estoqueremedio.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Tipo")
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
