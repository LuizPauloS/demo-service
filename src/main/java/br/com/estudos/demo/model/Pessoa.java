package br.com.estudos.demo.model;

import br.com.estudos.demo.domain.TipoPessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa extends BaseEntity {

    private String nome;

    @Enumerated(EnumType.ORDINAL)
    private TipoPessoa tipo;

    private LocalDate dataDeNascimento;
}
