package com.loja.loja.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PedidosTests {

    @Test
    void validarPropriedades() {

        var pedido = new Pedido();

        var data = LocalDateTime.now();

        pedido.setIdCliente(1);
        pedido.setValorTotal(10.0);
        pedido.setDat(data);

        assertEquals(1, pedido.getIdCliente());
        assertEquals(10.0, pedido.getValorTotal());
        assertEquals(data, pedido.getDat());
        
    }
}
