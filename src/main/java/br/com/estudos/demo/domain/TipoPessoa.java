package br.com.estudos.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoPessoa {

    Cônjuge(0),
    Dependente(1),
    Pretendente(2);

    private Integer id;
}
