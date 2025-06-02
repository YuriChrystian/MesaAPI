package com.faj.lucas.santos.aula8restauranteserver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Mesa {
    private Integer id;
    private Boolean isOpen;
    private Integer cliente;
    private Double total;
    private List<Produto>produtos;

    public Double getTotal{

    }
}
