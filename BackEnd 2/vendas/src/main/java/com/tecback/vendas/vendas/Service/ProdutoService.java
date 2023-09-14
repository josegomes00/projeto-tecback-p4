package com.tecback.vendas.vendas.Produto;

import com.tecback.vendas.vendas.Model.ProdutoModel;
import com.tecback.vendas.vendas.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> listPorNome(String nome){
        return  repository.findByNomeContainsIgnoreCase(nome);
    }

}