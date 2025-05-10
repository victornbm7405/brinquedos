package br.com.fiap.brinquedos.controller;

import br.com.fiap.brinquedos.model.Brinquedo;
import br.com.fiap.brinquedos.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoRepository repository;

    @PostMapping
    public Brinquedo create(@RequestBody Brinquedo brinquedo) {
        return repository.save(brinquedo);
    }

    @GetMapping
    public List<Brinquedo> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Brinquedo> findById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
