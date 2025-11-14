package com.poli.market.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.poli.market.entity.Producto;

@Repository
class ProductoRepositoryInMemory implements IProductoRepository {

    private final List<Producto> productos = new ArrayList<>();

    public ProductoRepositoryInMemory() {
        // Datos quemados
    	Producto p1 = new Producto();
        p1.setIdProducto(1);
        p1.setNombreProducto("Gaseosa 350ml");
        p1.setDescripcion("Bebida azucarada");
        p1.setPrecio(3500.0);
        p1.setUnidadMedida("UND");
        p1.setEstado(true);

        Producto p2 = new Producto();
        p2.setIdProducto(2);
        p2.setNombreProducto("Papas fritas");
        p2.setDescripcion("Snack salado");
        p2.setPrecio(2500.0);
        p2.setUnidadMedida("UND");
        p2.setEstado(true);

        Producto p3 = new Producto();
        p3.setIdProducto(3);
        p3.setNombreProducto("Chocolate");
        p3.setDescripcion("Chocolate de mesa");
        p3.setPrecio(4200.0);
        p3.setUnidadMedida("UND");
        p3.setEstado(false); // no disponible

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
    }

    @Override
    public List<Producto> listarProductosDisponibles(String estado) {
        // si estado = "DISPONIBLE" devolvemos solo true, si viene null devolvemos todos
        if (estado == null || estado.isBlank()) {
            return productos;
        }
        boolean disponible = estado.equalsIgnoreCase("DISPONIBLE");
        return productos.stream()
                .filter(p -> p.getEstado() == disponible)
                .collect(Collectors.toList());
    }
}