package com.poli.market.repository;

import java.util.List;

import com.poli.market.entity.Producto;

public interface IProductoRepository {
	
    List<Producto> listarProductosDisponibles(String estado);
    
}
