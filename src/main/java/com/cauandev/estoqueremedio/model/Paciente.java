package com.cauandev.estoqueremedio.model;

import jakarta.persistence.Id;

import java.math.BigInteger;

public class Paciente {
    @Id
    private Long cpf;
    private String name;
    private Endereco endereco;

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
