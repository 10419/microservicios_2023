package com.example.venta.service;

import com.example.venta.entity.venta;
import java.util.List;
import java.util.Optional;

public interface ventaservice {
    public List<venta> list();

    public venta save(venta venta);

    public venta update(venta venta);

    public Optional<venta> listById(Integer id);

    public void deleteById(Integer id);
}