package com.loja.loja.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProdutosTests {

    @Test
    void validarPropriedades() {

        var produto = new Produto();

        produto.setNome("Produto 1");
        produto.setDescricao("Descrição 1");
        produto.setValor(10.0);
        produto.setQuantidade(10);

        assertEquals("Produto 1", produto.getNome());
        assertEquals("Descrição 1", produto.getDescricao());
        assertEquals(10.0, produto.getValor());
        assertEquals(10, produto.getQuantidade());
    }

    @Test
    void geraCodigoAoSetarNome() {
        var produto = new Produto();
        produto.setNome("Bicicleta");

        assertEquals("BIC-9", produto.getCodigo());
    }

    @Test
    void casoAltereOnomeCodigoFicaOMesmo() {
        var produto = new Produto();
        produto.setNome("Bicicleta");
        produto.setNome("Roda");

        assertEquals("BIC-9", produto.getCodigo());
    }
}
