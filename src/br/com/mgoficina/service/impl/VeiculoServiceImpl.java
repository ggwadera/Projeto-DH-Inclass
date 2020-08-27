package br.com.mgoficina.service.impl;

import br.com.mgoficina.exception.DataIntegrityException;
import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.model.Servico;
import br.com.mgoficina.model.Veiculo;
import br.com.mgoficina.service.IVeiculoService;

import java.lang.reflect.Field;
import java.util.List;

public class VeiculoServiceImpl extends ServiceImpl<Veiculo> implements IVeiculoService {

    private final static VeiculoServiceImpl SINGLE_INSTANCE = new VeiculoServiceImpl();

    private VeiculoServiceImpl() {
        super();
    }

    public static VeiculoServiceImpl getInstance() {
        return SINGLE_INSTANCE;
    }

    @Override
    public boolean fieldsAreValid(Veiculo veiculo) {
        Field[] fields = veiculo.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(veiculo);
                if (value == null) {
                    return false;
                }
                if (value instanceof String && ((String) value).isEmpty()) {
                    return false;
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    @Override
    public List<Veiculo> findByCliente(Cliente cliente) {
        return null;
    }

    @Override
    public List<Veiculo> findByServico(Servico servico) {
        return null;
    }

    @Override
    public Veiculo create(Veiculo veiculo) throws DataIntegrityException {
        if (!this.fieldsAreValid(veiculo)) {
            throw new DataIntegrityException("Veículo não pode ter campos nulos ou vazios.");
        }
        this.list.add(veiculo);
        return veiculo;
    }
}
