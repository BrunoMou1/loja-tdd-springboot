package com.loja.loja.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PedidoProdutosTests {

	@Test
	void validarPropriedades() {
		var pedidoProduto = new PedidoProduto();

		pedidoProduto.setIdPedido(1);
		pedidoProduto.setIdProduto(1);
		pedidoProduto.setQuantidade(10);
		pedidoProduto.setValor(10.0);

		assertEquals(1, pedidoProduto.getIdPedido());
		assertEquals(1, pedidoProduto.getIdProduto());
		assertEquals(10, pedidoProduto.getQuantidade());
		assertEquals(10.0, pedidoProduto.getValor());
	}
}
