package com.example.cliente.service;

import com.example.cliente.entity.cliente;
import java.util.List;
import java.util.Optional;

public interface clienteservice  {
    public List<cliente> list();

    public cliente save(cliente cliente);

    public cliente update(cliente cliente);

    public Optional<cliente> listById(Integer id);

    public void deleteById(Integer id);
}
