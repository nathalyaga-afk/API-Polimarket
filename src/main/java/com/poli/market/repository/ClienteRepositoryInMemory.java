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
    	// Datos quemados de clientes
    	Cliente c1 = new Cliente();
    	c1.setIdCliente(1);
    	c1.setNombres("Juan Pérez");
    	c1.setCorreo("juan.perez@example.com");
    	c1.setCelular("3001112233");
    	c1.setPotencial(true);

    	Cliente c2 = new Cliente();
    	c2.setIdCliente(2);
    	c2.setNombres("Ana Gómez");
    	c2.setCorreo("ana.gomez@example.com");
    	c2.setCelular("3002223344");
    	c2.setPotencial(false);

    	Cliente c3 = new Cliente();
    	c3.setIdCliente(3);
    	c3.setNombres("Carlos López");
    	c3.setCorreo("carlos.lopez@example.com");
    	c3.setCelular("3003334455");
    	c3.setPotencial(true);

    	Cliente c4 = new Cliente();
    	c4.setIdCliente(4);
    	c4.setNombres("María Rodríguez");
    	c4.setCorreo("maria.rodriguez@example.com");
    	c4.setCelular("3004445566");
    	c4.setPotencial(true);

    	Cliente c5 = new Cliente();
    	c5.setIdCliente(5);
    	c5.setNombres("Luis Herrera");
    	c5.setCorreo("luis.herrera@example.com");
    	c5.setCelular("3005556677");
    	c5.setPotencial(false);

    	Cliente c6 = new Cliente();
    	c6.setIdCliente(6);
    	c6.setNombres("Diana Castillo");
    	c6.setCorreo("diana.castillo@example.com");
    	c6.setCelular("3006667788");
    	c6.setPotencial(true);

    	Cliente c7 = new Cliente();
    	c7.setIdCliente(7);
    	c7.setNombres("Andrés Ramírez");
    	c7.setCorreo("andres.ramirez@example.com");
    	c7.setCelular("3007778899");
    	c7.setPotencial(true);

    	Cliente c8 = new Cliente();
    	c8.setIdCliente(8);
    	c8.setNombres("Paola Martínez");
    	c8.setCorreo("paola.martinez@example.com");
    	c8.setCelular("3008889900");
    	c8.setPotencial(false);

    	Cliente c9 = new Cliente();
    	c9.setIdCliente(9);
    	c9.setNombres("Felipe Torres");
    	c9.setCorreo("felipe.torres@example.com");
    	c9.setCelular("3011112233");
    	c9.setPotencial(true);

    	Cliente c10 = new Cliente();
    	c10.setIdCliente(10);
    	c10.setNombres("Laura Sánchez");
    	c10.setCorreo("laura.sanchez@example.com");
    	c10.setCelular("3012223344");
    	c10.setPotencial(true);

    	Cliente c11 = new Cliente();
    	c11.setIdCliente(11);
    	c11.setNombres("Sergio Morales");
    	c11.setCorreo("sergio.morales@example.com");
    	c11.setCelular("3013334455");
    	c11.setPotencial(false);

    	Cliente c12 = new Cliente();
    	c12.setIdCliente(12);
    	c12.setNombres("Carolina Díaz");
    	c12.setCorreo("carolina.diaz@example.com");
    	c12.setCelular("3014445566");
    	c12.setPotencial(true);

    	Cliente c13 = new Cliente();
    	c13.setIdCliente(13);
    	c13.setNombres("Julián Ramírez");
    	c13.setCorreo("julian.ramirez@example.com");
    	c13.setCelular("3015556677");
    	c13.setPotencial(true);

    	Cliente c14 = new Cliente();
    	c14.setIdCliente(14);
    	c14.setNombres("Natalia Cruz");
    	c14.setCorreo("natalia.cruz@example.com");
    	c14.setCelular("3016667788");
    	c14.setPotencial(true);

    	Cliente c15 = new Cliente();
    	c15.setIdCliente(15);
    	c15.setNombres("Camilo Vargas");
    	c15.setCorreo("camilo.vargas@example.com");
    	c15.setCelular("3017778899");
    	c15.setPotencial(false);

    	Cliente c16 = new Cliente();
    	c16.setIdCliente(16);
    	c16.setNombres("Valentina Ríos");
    	c16.setCorreo("valentina.rios@example.com");
    	c16.setCelular("3021112233");
    	c16.setPotencial(true);

    	Cliente c17 = new Cliente();
    	c17.setIdCliente(17);
    	c17.setNombres("Miguel Ortiz");
    	c17.setCorreo("miguel.ortiz@example.com");
    	c17.setCelular("3022223344");
    	c17.setPotencial(true);

    	Cliente c18 = new Cliente();
    	c18.setIdCliente(18);
    	c18.setNombres("Daniela Peña");
    	c18.setCorreo("daniela.pena@example.com");
    	c18.setCelular("3023334455");
    	c18.setPotencial(true);

    	Cliente c19 = new Cliente();
    	c19.setIdCliente(19);
    	c19.setNombres("Esteban Núñez");
    	c19.setCorreo("esteban.nunez@example.com");
    	c19.setCelular("3024445566");
    	c19.setPotencial(false);

    	Cliente c20 = new Cliente();
    	c20.setIdCliente(20);
    	c20.setNombres("Sara Muñoz");
    	c20.setCorreo("sara.munoz@example.com");
    	c20.setCelular("3025556677");
    	c20.setPotencial(true);

    	// Agregar todos a la lista
    	clientes.add(c1); clientes.add(c2); clientes.add(c3); clientes.add(c4); clientes.add(c5);
    	clientes.add(c6); clientes.add(c7); clientes.add(c8); clientes.add(c9); clientes.add(c10);
    	clientes.add(c11); clientes.add(c12); clientes.add(c13); clientes.add(c14); clientes.add(c15);
    	clientes.add(c16); clientes.add(c17); clientes.add(c18); clientes.add(c19); clientes.add(c20);

    }

    @Override
    public List<Cliente> listarClientesPotenciales() {
        return clientes.stream()
                .filter(Cliente::getPotencial)
                .collect(Collectors.toList());
    }
}
