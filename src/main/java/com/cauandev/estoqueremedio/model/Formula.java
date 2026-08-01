package com.cauandev.estoqueremedio.model;

import java.time.LocalDate;

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
