package com.poli.market.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.poli.market.entity.Cliente;

@Repository
class ClienteRepositoryInMemory implements IClienteRepository {

    private final List<Cliente> clientes = new ArrayList<>();

    public ClienteRepositoryInMemory() {
    	Cliente c1 = new Cliente();
        c1.setIdCliente(1);
        c1.setNombres("Juan Pérez");
        c1.setCorreo("juan@example.com");
        c1.setCelular("3001112233");
        c1.setPotencial(true);

        Cliente c2 = new Cliente();
        c2.setIdCliente(2);
        c2.setNombres("Ana Gómez");
        c2.setCorreo("ana@example.com");
        c2.setCelular("3004445566");
        c2.setPotencial(false);

        Cliente c3 = new Cliente();
        c3.setIdCliente(3);
        c3.setNombres("Carlos López");
        c3.setCorreo("carlos@example.com");
        c3.setCelular("3017778899");
        c3.setPotencial(true);

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
    }

    @Override
    public List<Cliente> listarClientesPotenciales() {
        return clientes.stream()
                .filter(Cliente::getPotencial)
                .collect(Collectors.toList());
    }
}
