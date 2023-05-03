package com.example.venta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.venta.entity.venta;
import com.example.venta.service.ventaservice;

@RestController
@RequestMapping("/venta")
public class ventacontroller {
    @Autowired
    private ventaservice cs;

    @GetMapping()
    public java.util.List<venta> listar() {
        return cs.list();
    }

    @PostMapping()
    public venta guarda(@RequestBody venta venta) {
        return cs.save(venta);
    }

    @GetMapping("{id}")
    public venta buscarPorID(@PathVariable(required = true) Integer id) {
        return cs.listById(id).get();
    }

    @PutMapping()
    public venta actu(@RequestBody venta venta) {
        return cs.update(venta);
    }

    @DeleteMapping("{id}")
    public void eliminarporid(@PathVariable(required = true) Integer id) {
        cs.deleteById(id);
    }

}