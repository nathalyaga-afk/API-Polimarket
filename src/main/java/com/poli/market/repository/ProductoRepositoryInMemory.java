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
    	p1.setDescripcion("Bebida carbonatada sabor cola");
    	p1.setPrecio(3500.0);
    	p1.setUnidadMedida("UND");
    	p1.setEstado(true);

    	Producto p2 = new Producto();
    	p2.setIdProducto(2);
    	p2.setNombreProducto("Papas Fritas Clásicas");
    	p2.setDescripcion("Snack de papa sabor original");
    	p2.setPrecio(2800.0);
    	p2.setUnidadMedida("UND");
    	p2.setEstado(true);

    	Producto p3 = new Producto();
    	p3.setIdProducto(3);
    	p3.setNombreProducto("Chocolate de Mesa");
    	p3.setDescripcion("Chocolate tradicional para bebida");
    	p3.setPrecio(4200.0);
    	p3.setUnidadMedida("UND");
    	p3.setEstado(true);

    	Producto p4 = new Producto();
    	p4.setIdProducto(4);
    	p4.setNombreProducto("Jugo de Naranja 500ml");
    	p4.setDescripcion("Bebida de naranja natural");
    	p4.setPrecio(5200.0);
    	p4.setUnidadMedida("UND");
    	p4.setEstado(true);

    	Producto p5 = new Producto();
    	p5.setIdProducto(5);
    	p5.setNombreProducto("Agua Mineral 600ml");
    	p5.setDescripcion("Agua con gas");
    	p5.setPrecio(2400.0);
    	p5.setUnidadMedida("UND");
    	p5.setEstado(true);

    	Producto p6 = new Producto();
    	p6.setIdProducto(6);
    	p6.setNombreProducto("Café Molido 250g");
    	p6.setDescripcion("Café premium tostado");
    	p6.setPrecio(9800.0);
    	p6.setUnidadMedida("UND");
    	p6.setEstado(true);

    	Producto p7 = new Producto();
    	p7.setIdProducto(7);
    	p7.setNombreProducto("Arroz Blanco 1kg");
    	p7.setDescripcion("Arroz extra largo");
    	p7.setPrecio(4600.0);
    	p7.setUnidadMedida("UND");
    	p7.setEstado(true);

    	Producto p8 = new Producto();
    	p8.setIdProducto(8);
    	p8.setNombreProducto("Fríjol Rojo 500g");
    	p8.setDescripcion("Fríjol tipo bola roja");
    	p8.setPrecio(5300.0);
    	p8.setUnidadMedida("UND");
    	p8.setEstado(true);

    	Producto p9 = new Producto();
    	p9.setIdProducto(9);
    	p9.setNombreProducto("Azúcar Morena 1kg");
    	p9.setDescripcion("Azúcar de caña orgánica");
    	p9.setPrecio(3900.0);
    	p9.setUnidadMedida("UND");
    	p9.setEstado(true);

    	Producto p10 = new Producto();
    	p10.setIdProducto(10);
    	p10.setNombreProducto("Sal Rosada 500g");
    	p10.setDescripcion("Sal rosada del Himalaya");
    	p10.setPrecio(3500.0);
    	p10.setUnidadMedida("UND");
    	p10.setEstado(true);

    	Producto p11 = new Producto();
    	p11.setIdProducto(11);
    	p11.setNombreProducto("Aceite Vegetal 1L");
    	p11.setDescripcion("Aceite 100% vegetal");
    	p11.setPrecio(9800.0);
    	p11.setUnidadMedida("UND");
    	p11.setEstado(true);

    	Producto p12 = new Producto();
    	p12.setIdProducto(12);
    	p12.setNombreProducto("Huevos A (30 unidades)");
    	p12.setDescripcion("Huevos frescos tamaño A");
    	p12.setPrecio(14500.0);
    	p12.setUnidadMedida("UND");
    	p12.setEstado(true);

    	Producto p13 = new Producto();
    	p13.setIdProducto(13);
    	p13.setNombreProducto("Pan Tajado 500g");
    	p13.setDescripcion("Pan tajado blanco tradicional");
    	p13.setPrecio(5500.0);
    	p13.setUnidadMedida("UND");
    	p13.setEstado(true);

    	Producto p14 = new Producto();
    	p14.setIdProducto(14);
    	p14.setNombreProducto("Queso Mozzarella 250g");
    	p14.setDescripcion("Queso mozzarella fresco");
    	p14.setPrecio(8900.0);
    	p14.setUnidadMedida("UND");
    	p14.setEstado(true);

    	Producto p15 = new Producto();
    	p15.setIdProducto(15);
    	p15.setNombreProducto("Yogur Natural 1L");
    	p15.setDescripcion("Yogur sin azúcar");
    	p15.setPrecio(6500.0);
    	p15.setUnidadMedida("UND");
    	p15.setEstado(false);

    	Producto p16 = new Producto();
    	p16.setIdProducto(16);
    	p16.setNombreProducto("Mantequilla 250g");
    	p16.setDescripcion("Mantequilla con sal");
    	p16.setPrecio(6300.0);
    	p16.setUnidadMedida("UND");
    	p16.setEstado(false);

    	Producto p17 = new Producto();
    	p17.setIdProducto(17);
    	p17.setNombreProducto("Jamón de Cerdo 250g");
    	p17.setDescripcion("Jamón tipo sandwich");
    	p17.setPrecio(7200.0);
    	p17.setUnidadMedida("UND");
    	p17.setEstado(false);

    	Producto p18 = new Producto();
    	p18.setIdProducto(18);
    	p18.setNombreProducto("Cereal de Maíz 300g");
    	p18.setDescripcion("Cereal crujiente fortificado");
    	p18.setPrecio(5800.0);
    	p18.setUnidadMedida("UND");
    	p18.setEstado(true);

    	Producto p19 = new Producto();
    	p19.setIdProducto(19);
    	p19.setNombreProducto("Galletas de Chocolate 12u");
    	p19.setDescripcion("Galletas tipo wafer rellenas");
    	p19.setPrecio(3400.0);
    	p19.setUnidadMedida("UND");
    	p19.setEstado(true);

    	Producto p20 = new Producto();
    	p20.setIdProducto(20);
    	p20.setNombreProducto("Helado Vainilla 1L");
    	p20.setDescripcion("Helado artesanal sabor vainilla");
    	p20.setPrecio(9800.0);
    	p20.setUnidadMedida("UND");
    	p20.setEstado(true);

    	Producto p21 = new Producto();
    	p21.setIdProducto(21);
    	p21.setNombreProducto("Arequipe 400g");
    	p21.setDescripcion("Arequipe cremoso tradicional");
    	p21.setPrecio(4800.0);
    	p21.setUnidadMedida("UND");
    	p21.setEstado(true);

    	Producto p22 = new Producto();
    	p22.setIdProducto(22);
    	p22.setNombreProducto("Té Verde 500ml");
    	p22.setDescripcion("Bebida sabor té verde");
    	p22.setPrecio(2900.0);
    	p22.setUnidadMedida("UND");
    	p22.setEstado(true);

    	Producto p23 = new Producto();
    	p23.setIdProducto(23);
    	p23.setNombreProducto("Salsa de Tomate 400g");
    	p23.setDescripcion("Salsa tipo ketchup");
    	p23.setPrecio(3500.0);
    	p23.setUnidadMedida("UND");
    	p23.setEstado(true);

    	Producto p24 = new Producto();
    	p24.setIdProducto(24);
    	p24.setNombreProducto("Mayonesa 400g");
    	p24.setDescripcion("Mayonesa clásica");
    	p24.setPrecio(3900.0);
    	p24.setUnidadMedida("UND");
    	p24.setEstado(true);

    	Producto p25 = new Producto();
    	p25.setIdProducto(25);
    	p25.setNombreProducto("Cerveza 330ml");
    	p25.setDescripcion("Cerveza rubia premium");
    	p25.setPrecio(3200.0);
    	p25.setUnidadMedida("UND");
    	p25.setEstado(true);

    	Producto p26 = new Producto();
    	p26.setIdProducto(26);
    	p26.setNombreProducto("Leche Entera 1L");
    	p26.setDescripcion("Leche ultrapasteurizada");
    	p26.setPrecio(4300.0);
    	p26.setUnidadMedida("UND");
    	p26.setEstado(true);

    	Producto p27 = new Producto();
    	p27.setIdProducto(27);
    	p27.setNombreProducto("Pollo Entero 2kg");
    	p27.setDescripcion("Pollo fresco empacado");
    	p27.setPrecio(15800.0);
    	p27.setUnidadMedida("UND");
    	p27.setEstado(true);

    	Producto p28 = new Producto();
    	p28.setIdProducto(28);
    	p28.setNombreProducto("Carne Molida 500g");
    	p28.setDescripcion("Carne de res molida premium");
    	p28.setPrecio(9800.0);
    	p28.setUnidadMedida("UND");
    	p28.setEstado(true);

    	Producto p29 = new Producto();
    	p29.setIdProducto(29);
    	p29.setNombreProducto("Tortillas de Trigo 10u");
    	p29.setDescripcion("Tortillas listas para tacos");
    	p29.setPrecio(5200.0);
    	p29.setUnidadMedida("UND");
    	p29.setEstado(true);

    	Producto p30 = new Producto();
    	p30.setIdProducto(30);
    	p30.setNombreProducto("Atún en Agua 170g");
    	p30.setDescripcion("Lata de atún premium");
    	p30.setPrecio(4800.0);
    	p30.setUnidadMedida("UND");
    	p30.setEstado(true);

    	// Agregar todos
    	productos.add(p1); productos.add(p2); productos.add(p3); productos.add(p4); productos.add(p5);
    	productos.add(p6); productos.add(p7); productos.add(p8); productos.add(p9); productos.add(p10);
    	productos.add(p11); productos.add(p12); productos.add(p13); productos.add(p14); productos.add(p15);
    	productos.add(p16); productos.add(p17); productos.add(p18); productos.add(p19); productos.add(p20);
    	productos.add(p21); productos.add(p22); productos.add(p23); productos.add(p24); productos.add(p25);
    	productos.add(p26); productos.add(p27); productos.add(p28); productos.add(p29); productos.add(p30);

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