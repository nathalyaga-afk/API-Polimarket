package com.poli.market.services.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.poli.market.entity.Cliente;
import com.poli.market.repository.IClienteRepository;
import com.poli.market.services.IClienteService;

@Service
public class ClienteService implements IClienteService {

    private final IClienteRepository clienteRepository;

    public ClienteService(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<Cliente> listarClientesPotenciales() {
        return clienteRepository.listarClientesPotenciales();
    }
}
