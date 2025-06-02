package com.faj.lucas.santos.aula8restauranteserver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Produto {
    private Double valor;
    private String nome;
}
