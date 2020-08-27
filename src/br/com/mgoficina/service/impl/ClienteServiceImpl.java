package br.com.mgoficina.service.impl;

import br.com.mgoficina.exception.DataIntegrityException;
import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.service.IClienteService;

public class ClienteServiceImpl extends ServiceImpl<Cliente> implements IClienteService {

    private final static ClienteServiceImpl SINGLE_INSTANCE = new ClienteServiceImpl();

    private ClienteServiceImpl() {
        super();
    }

    public static ClienteServiceImpl getInstance() {
        return SINGLE_INSTANCE;
    }

    @Override
    public Cliente create(Cliente cliente) throws DataIntegrityException {
        if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
            throw new DataIntegrityException("Nome não pode ser nulo ou vazio.");
        }
        if (cliente.getCpf() == null || cliente.getCpf().isEmpty()) {
            throw new DataIntegrityException("CPF não pode ser nulo ou vazio.");
        }
        this.list.add(cliente);
        return cliente;
    }

    @Override
    public Cliente findByNome(String nome) throws ObjectNotFoundException {
        return this.list.stream()
                .filter(t -> t.getNome().equals(nome))
                .findAny()
                .orElseThrow(() -> new ObjectNotFoundException("nome: " + nome));
    }
}
