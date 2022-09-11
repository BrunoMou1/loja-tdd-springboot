package com.loja.loja.daos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.loja.loja.dao.IClientesDao;
import com.loja.loja.models.Cliente;

@SpringBootTest
class ClienteDaoTests {
    @BeforeEach
    public void LimparBase() {
        clienteDao.deleteAll();
    }

    @Autowired
    private IClientesDao clienteDao;

    @Test
    void validarFindDoDaoDeCliente() {
        assertEquals(0, clienteDao.count());
    }

	@Test
	void validarSeEmailCadastradoNaoExiste() {
		var clienteNaoExiste = clienteDao.emailExiste("dd@teste.com");
		assertEquals(false, clienteNaoExiste);
	}

	@Test
	void validarSeEmailCadastradoExiste() {
		var cliente = new Cliente();
		cliente.setEmail("teste@teste.com");
		clienteDao.save(cliente);
		
		var clienteExiste = clienteDao.emailExiste("teste@teste.com");
		assertEquals(true, clienteExiste);
	}
}
