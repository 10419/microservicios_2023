package com.example.catalogo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.catalogo.entity.categoria;
import com.example.catalogo.service.categoriaservice;

@RestController
@RequestMapping("/categoria")
public class categoriacontroller {
    @Autowired
    private categoriaservice cs;

    @GetMapping()
    public java.util.List<categoria> listar() {
        return cs.list();
    }

    @PostMapping()
    public categoria guarda(@RequestBody categoria categoria) {
        return cs.save(categoria);
    }

    @GetMapping("{id}")
    public categoria buscarPorID(@PathVariable(required = true) Integer id) {
        return cs.listById(id).get();
    }

    @PutMapping()
    public categoria actu(@RequestBody categoria categoria) {
        return cs.update(categoria);
    }

    @DeleteMapping("{id}")
    public void eliminarporid(@PathVariable(required = true) Integer id) {
        cs.deleteById(id);
    }

}