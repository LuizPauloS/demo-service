package br.com.estudos.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {

    CADASTRO_VALIDO(0,"Cadastro válido"),
    JA_POSSUI_CASA(1,"Já possui uma casa"),
    SELECIONADA_OUTRO_PROCESSO(2,"Selecionada em outro processo de seleção"),
    CADASTRO_INCOMPLETO(3,"Cadastro incompleto");

    private Integer id;
    private String valor;
}
