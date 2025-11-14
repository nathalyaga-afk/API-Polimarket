package com.poli.market.services;

import java.util.List;

import com.poli.market.entity.Cliente;

public interface IClienteService {
	
    List<Cliente> listarClientesPotenciales();
    
}