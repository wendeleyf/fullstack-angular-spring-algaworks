package com.algaworks.algamoney.api.resource;

import com.algaworks.algamoney.api.event.RecursoCriadoEvent;
import com.algaworks.algamoney.api.model.Lancamento;
import com.algaworks.algamoney.api.repository.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoResource {

    @Autowired
    LancamentoRepository lancamentoRepository;

    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping
    public List<Lancamento> listar(){
        return lancamentoRepository.findAll();
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<?> buscarPeloId(@PathVariable Long codigo){
        Lancamento lancamento = lancamentoRepository.findById(codigo).orElse(null);
        return lancamento != null ? ResponseEntity.ok(lancamento) : ResponseEntity.notFound().build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Lancamento> criar(@Valid @RequestBody Lancamento lancamento, HttpServletResponse response){
        Lancamento lancamentoSalvo = lancamentoRepository.save(lancamento);
        publisher.publishEvent(new RecursoCriadoEvent(this,response, lancamentoSalvo.getCodigo()));
        return ResponseEntity.status(HttpStatus.CREATED).body(lancamentoSalvo);
    }
}