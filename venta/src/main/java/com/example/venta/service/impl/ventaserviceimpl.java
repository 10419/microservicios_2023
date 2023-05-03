package com.example.venta.service.impl;

import com.example.venta.entity.venta;
import com.example.venta.repository.ventarepository;
import com.example.venta.service.ventaservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ventaserviceimpl implements ventaservice {
    @Autowired
    private ventarepository vr;

    @Override
    public List<venta> list() {
        return vr.findAll();
    }

    @Override
    public venta save(venta venta) {
        return vr.save(venta);
    }

    @Override
    public venta update(venta venta) {
        return vr.save(venta);
    }

    @Override
    public Optional<venta> listById(Integer id) {
        return vr.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        vr.deleteById(id);
    }

}