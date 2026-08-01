package com.cauandev.estoqueremedio.model;

import java.time.LocalDate;

/**
 * Cada enum sabe qual o tempo de validade dele mesmo.<p>
 * Funciona como um <b>Strategy</b> pois possuem um mesmo método que funciona de formas diferentes
 * para o mesmo tipo de enum.
 */
public enum Formula {
    XAROPE {
        @Override
        public LocalDate calcularValidade(TipoRemedio remedio) {
            return remedio.getExpedicao().plusMonths(12);
        }
    },
    COMPRIMIDO {
        @Override
        public LocalDate calcularValidade(TipoRemedio remedio) {
            return remedio.getExpedicao().plusMonths(24);
        }
    };

    public abstract LocalDate calcularValidade(TipoRemedio remedio);
}
