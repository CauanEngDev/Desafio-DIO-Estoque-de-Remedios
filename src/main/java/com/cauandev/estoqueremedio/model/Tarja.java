package com.cauandev.estoqueremedio.model;

import com.cauandev.estoqueremedio.service.ViaCepService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Cada Enum possui um método proprio que diz como ele deve agir.<p>
 *  * Funciona como um <b>Strategy</b> pois possuem um mesmo método que funciona de formas diferentes
 *  * para o mesmo tipo de enum.
 */
public enum Tarja {
    TARJA_PRETA {
        @Override
        public InfoVenda processarVenda(TipoRemedio remedio, String compradorNome, String compradorCPF,
                                        String compradorCep, ViaCepService viacep) {
            Endereco endereco = viacep.consultarCep(compradorCep);
            return new InfoVenda(
                    remedio.getName(),
                    LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    remedio.getFormula().calcularValidade(remedio).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    compradorNome,
                    compradorCPF,
                    endereco
            );
        }
    },
    TARJA_VERMELHA {
        @Override
        public InfoVenda processarVenda(TipoRemedio remedio, String compradorNome, String compradorCPF,
                                        String compradorCep, ViaCepService viacep) {
            return new InfoVenda(
                    remedio.getName(),
                    LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    remedio.getFormula().calcularValidade(remedio).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    compradorNome,
                    compradorCPF,
                    null
            );
        }
    },
    SEM_TARJA {
        @Override
        public InfoVenda processarVenda(TipoRemedio remedio, String compradorNome, String compradorCPF,
                                        String compradorCep, ViaCepService viacep) {
            return new InfoVenda(
                    remedio.getName(),
                    LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    remedio.getFormula().calcularValidade(remedio).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    null,
                    null,
                    null
            );
        }
    };

    public abstract InfoVenda processarVenda(TipoRemedio remedio, String compradorNome, String compradorCPF,
                                             String compradorCep, ViaCepService viacep);
}
