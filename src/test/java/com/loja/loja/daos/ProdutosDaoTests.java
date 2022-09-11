package com.loja.loja.daos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.loja.loja.dao.IClientesDao;

@SpringBootTest
class ProdutosDaoTests {
    @BeforeEach
    public void LimparBase() {
        produtoDao.deleteAll();
    }

    @Autowired
    private IClientesDao produtoDao;

    @Test
    void validarFindDoDaoDeCliente() {
        assertEquals(0, produtoDao.count());
    }
}
