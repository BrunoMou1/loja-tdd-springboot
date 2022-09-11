package com.loja.loja.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientesTests {

	@Test
	void validarPropriedades() {

		var cliente = new Cliente();

		cliente.setNome("Bruno");
		cliente.setEmail("bruno@teste.com");
		cliente.setSenha("123456");
		cliente.setEndereco("Rua 1");
		cliente.setNumero("123");
		cliente.setCep("12345-678");
		cliente.setCidade("São Paulo");
		cliente.setBairro("Bairro 1");
		cliente.setEstado("SP");
		cliente.setComplemento("Complemento 1");

		assertEquals("Bruno", cliente.getNome());
		assertEquals("bruno@teste.com", cliente.getEmail());
		assertEquals("123456", cliente.getSenha());
		assertEquals("Rua 1", cliente.getEndereco());
		assertEquals("123", cliente.getNumero());
		assertEquals("12345-678", cliente.getCep());
		assertEquals("São Paulo", cliente.getCidade());
		assertEquals("Bairro 1", cliente.getBairro());
		assertEquals("SP", cliente.getEstado());
		assertEquals("Complemento 1", cliente.getComplemento());
	
	}
}
