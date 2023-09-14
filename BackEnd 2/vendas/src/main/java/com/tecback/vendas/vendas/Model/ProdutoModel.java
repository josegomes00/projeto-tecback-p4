package com.tecback.vendas.vendas.Produto;

import lombok.*;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProdutoModel extends Serializable {

    @Id
    private int id;
    private String nome;
    private double preco;
}