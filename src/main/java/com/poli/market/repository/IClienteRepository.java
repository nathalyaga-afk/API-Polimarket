package com.poli.market.repository;

import java.util.List;

import com.poli.market.entity.Cliente;

public interface IClienteRepository {
	
    List<Cliente> listarClientesPotenciales();
    
}
