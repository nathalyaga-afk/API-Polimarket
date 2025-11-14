package com.poli.market.services.imp;


import org.springframework.stereotype.Service;

import com.poli.market.entity.Producto;
import com.poli.market.repository.IProductoRepository;
import com.poli.market.services.IProductoService;

import java.util.List;

@Service
public class ProductoService implements IProductoService {

    private final IProductoRepository productoRepository;

    public ProductoService(IProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> listarProductosDisponibles(String estado) {
        return productoRepository.listarProductosDisponibles(estado);
    }
}
