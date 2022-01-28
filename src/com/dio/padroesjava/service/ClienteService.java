package com.dio.padroesjava.service;


import com.dio.padroesjava.model.Cliente;

/**
 * Interface que define o padrão <b>Stratategy</b> no domínio do cliente.
 * Com isso, se necessário, pode-se ter múltiplas implementações dessa mesma
 * inteface.
 */


public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
