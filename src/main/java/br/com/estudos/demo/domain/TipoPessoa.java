package br.com.estudos.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoPessoa {

    CONJUGE(0, "Cônjuge"),
    DEPENDENTE(1, "Dependente"),
    PRETENDENTE(2, "Pretendente");

    private Integer id;
    private String valor;
}
