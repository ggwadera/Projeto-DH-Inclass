package br.com.mgoficina.service.impl;

import br.com.mgoficina.exception.DataIntegrityException;
import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Identifiable;
import br.com.mgoficina.service.IService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ServiceImpl<T extends Identifiable> implements IService<T> {

    protected final List<T> list;

    public ServiceImpl() {
        this.list = new ArrayList<>();
    }

    public ServiceImpl(List<T> list) {
        this.list = new ArrayList<>(list);
    }

    @Override
    public abstract T create(T t) throws DataIntegrityException;

    @Override
    public T findById(Long id) throws ObjectNotFoundException {
        return this.list.stream()
                .filter(t -> t.getId().equals(id))
                .findAny()
                .orElseThrow(() -> new ObjectNotFoundException("id: " + id));
    }

    @Override
    public List<T> findAll() {
        return Collections.unmodifiableList(list);
    }

    @Override
    public boolean updateById(Long id, T t) throws ObjectNotFoundException, DataIntegrityException {
        if (id < 0) {
            throw new DataIntegrityException("Id não deve ser negativo.");
        }
        int index = list.indexOf(this.findById(id));
        return !list.set(index, t).equals(t);
    }

    @Override
    public boolean deleteById(Long id) throws ObjectNotFoundException, DataIntegrityException {
        if (id < 0) {
            throw new DataIntegrityException("Id não deve ser negativo.");
        }
        int index = list.indexOf(this.findById(id));
        if (index < 0) {
            throw new ObjectNotFoundException("id: " + id);
        }
        return this.list.remove(this.list.get(index));
    }

    @Override
    public boolean delete(T t) {
        return this.list.remove(t);
    }
}
