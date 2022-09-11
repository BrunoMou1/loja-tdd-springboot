package com.loja.loja.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loja.loja.models.Produto;

@Repository
public interface IProdutosDao extends CrudRepository<Produto, Integer> {
}
