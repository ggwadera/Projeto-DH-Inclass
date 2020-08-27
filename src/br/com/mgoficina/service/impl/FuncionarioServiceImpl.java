package br.com.mgoficina.service.impl;

import br.com.mgoficina.exception.DataIntegrityException;
import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Funcionario;
import br.com.mgoficina.model.Servico;
import br.com.mgoficina.service.IFuncionarioService;

import java.util.List;
import java.util.stream.Collectors;

public class FuncionarioServiceImpl extends ServiceImpl<Funcionario> implements IFuncionarioService {

    private final static FuncionarioServiceImpl SINGLE_INSTANCE = new FuncionarioServiceImpl();

    private FuncionarioServiceImpl() {
        super();
    }

    public static FuncionarioServiceImpl getInstance() {
        return SINGLE_INSTANCE;
    }

    @Override
    public Funcionario findByNome(String nome) throws ObjectNotFoundException {
        return this.list.stream()
                .filter(t -> t.getNome().equals(nome))
                .findAny()
                .orElseThrow(() -> new ObjectNotFoundException("nome: " + nome));
    }

    @Override
    public List<Funcionario> findByServico(Servico servico) throws ObjectNotFoundException {
        List<Funcionario> funcionarios = this.list.stream()
                .filter(funcionario -> funcionario.getServicos().contains(servico))
                .collect(Collectors.toList());
        if (funcionarios.isEmpty()) {
            throw new ObjectNotFoundException("Nenhum funcionário encontrado: serviço id=" + servico.getId());
        }
        return funcionarios;
    }

    @Override
    public Funcionario create(Funcionario funcionario) throws DataIntegrityException {
        return null;
    }
}
