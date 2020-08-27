package br.com.mgoficina.service.impl;

import br.com.mgoficina.exception.DataIntegrityException;
import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.model.Servico;
import br.com.mgoficina.model.Veiculo;
import br.com.mgoficina.service.IServicoService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class ServicoServiceImpl extends ServiceImpl<Servico> implements IServicoService {

    public ServicoServiceImpl() {
        super();
    }

    @Override
    public List<Servico> findByCliente(Cliente cliente) throws ObjectNotFoundException {
        List<Servico> servicos = this.list.stream()
                .filter(servico -> servico.getCliente().equals(cliente))
                .collect(Collectors.toList());
        if (servicos.isEmpty()) {
            throw new ObjectNotFoundException("Nenhum serviço encontrado: cliente id=" + cliente.getId());
        }
        return servicos;
    }

    @Override
    public List<Servico> findByData(LocalDate dataDeInicio) throws ObjectNotFoundException {
        List<Servico> servicos = this.list.stream()
                .filter(servico -> dataDeInicio.isEqual(servico.getDataDeInicio()))
                .collect(Collectors.toList());
        if (servicos.isEmpty()) {
            throw new ObjectNotFoundException("Nenhum serviço encontrado: data " + dataDeInicio.toString());
        }
        return servicos;
    }

    @Override
    public List<Servico> findByData(LocalDate inicio, LocalDate fim) throws ObjectNotFoundException {
        List<Servico> servicos = this.list.stream()
                .filter(servico -> servico.getDataDeInicio().isAfter(inicio) && servico.getDataDeInicio().isBefore(fim))
                .collect(Collectors.toList());
        if (servicos.isEmpty()) {
            throw new ObjectNotFoundException("Nenhum serviço encontrado: entre " + inicio.toString() + " e " + fim.toString());
        }
        return servicos;
    }

    @Override
    public List<Servico> findByVeiculo(Veiculo veiculo) throws ObjectNotFoundException {
        return null;
    }

    @Override
    public Servico create(Servico servico) throws DataIntegrityException {
        return null;
    }
}
