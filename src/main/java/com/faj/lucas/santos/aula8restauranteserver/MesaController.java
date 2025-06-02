package com.faj.lucas.santos.aula8restauranteserver;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MesaController {
    ArrayList <Mesa> mesa = new ArrayList<>();

    public MesaController(){
        mesa.add(new Mesa(1,false,null,0.0,new ArrayList<>()));
        mesa.add(new Mesa(2,false,null,0.0,new ArrayList<>()));
        mesa.add(new Mesa(3,false,null,0.0,new ArrayList<>()));
        mesa.add(new Mesa(4,false,null,0.0,new ArrayList<>()));
        mesa.add(new Mesa(5,false,null,0.0,new ArrayList<>()));
        mesa.add(new Mesa(6,false,null,0.0,new ArrayList<>()));
        mesa.add(new Mesa(7,false,null,0.0,new ArrayList<>()));
        mesa.add(new Mesa(8,false,null,0.0,new ArrayList<>()));
    }

    @GetMapping("/restaurante/mesa/{idmesa}")
    public ResponseEntity<?> getMesa(@PathVariable("idmesa") Integer id){
        try{
            return ResponseEntity.ok(mesa.get(id - 1));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @DeleteMapping("/restaurante/mesa/{idmesa}")
    public ResponseEntity<?> limparMesa(@PathVariable("idmesa") Integer id){
        try{
            mesa.remove(id - 1);
            mesa.add(new Mesa(id,false,null,0.0,new ArrayList<>()));
            return ResponseEntity.ok(new Aviso("Mesa limpa com Sucesso"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping("/restaurante/mesa/{idmesa}/cliente/{idcliente}")
    public ResponseEntity<?> pegaMesa(@PathVariable("idmesa") Integer id,@PathVariable("idcliente") Integer id_cliente){
        try {
        }catch (Exception e){

        }
    }
}