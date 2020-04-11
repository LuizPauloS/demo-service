package br.com.estudos.demo.model;

import br.com.estudos.demo.domain.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Registro extends BaseEntity {

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pessoa> pessoas = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Renda> rendas = new ArrayList<>();

    @Enumerated(EnumType.ORDINAL)
    private Status status;
}
