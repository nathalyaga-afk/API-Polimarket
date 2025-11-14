package com.poli.market.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poli.market.entity.Cliente;
import com.poli.market.entity.Producto;
import com.poli.market.services.IClienteService;
import com.poli.market.services.IProductoService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/ventas")
public class VentasController {

	private final IProductoService productoService;
	private final IClienteService clienteService;

	public VentasController(IProductoService productoService, IClienteService clienteService) {
		this.productoService = productoService;
		this.clienteService = clienteService;
	}

	// GET /api/ventas/productos-disponibles?estado=DISPONIBLE
	@GetMapping("/productos-disponibles")
	public List<Producto> listarProductosDisponibles(
	        @RequestParam(name = "estado", required = false) String estado) {
	    return productoService.listarProductosDisponibles(estado);
	}

	// GET /api/ventas/clientes-potenciales
	@GetMapping("/clientes-potenciales")
	public List<Cliente> listarClientesPotenciales() {
		return clienteService.listarClientesPotenciales();
	}
}
