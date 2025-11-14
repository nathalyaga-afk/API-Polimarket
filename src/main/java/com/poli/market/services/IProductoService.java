package com.poli.market.services;

import java.util.List;

import com.poli.market.entity.Producto;

public interface IProductoService {
	
    List<Producto> listarProductosDisponibles(String estado);
    
}
