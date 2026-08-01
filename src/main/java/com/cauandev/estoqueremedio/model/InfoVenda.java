package com.cauandev.estoqueremedio.model;

public record InfoVenda(String remedioNome, String dataVenda, String validade, String nomeComprador,
                        String cpfComprador, Endereco endereco) {
}
