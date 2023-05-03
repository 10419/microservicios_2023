package com.example.catalogo.service.impl;

import com.example.catalogo.entity.categoria;
import com.example.catalogo.repository.categoriarepository;
import com.example.catalogo.service.categoriaservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class categoriaserviceimpl implements categoriaservice {
    @Autowired
    private categoriarepository cr;

    @Override
    public List<categoria> list() {
        return cr.findAll();
    }

    @Override
    public categoria save(categoria categoria) {
        return cr.save(categoria);
    }

    @Override
    public categoria update(categoria categoria) {
        return cr.save(categoria);
    }

    @Override
    public Optional<categoria> listById(Integer id) {
        return cr.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        cr.deleteById(id);
    }

}