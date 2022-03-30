package com.algaworks.algamoney.api.service;

import com.algaworks.algamoney.api.model.Pessoa;
import com.algaworks.algamoney.api.repository.PessoaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa atualizar(Long codigo, Pessoa pessoa){
        Pessoa pessoaSalva = pessoaRepository.findById(codigo).orElse(null); // Buscar pessoa pelo ID no DB
        if(pessoaSalva == null){
            throw new EmptyResultDataAccessException(1);
        }
        BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo"); //TODO explicação
        return pessoaRepository.save(pessoaSalva); // Salvar pessoa no DB
    }
}