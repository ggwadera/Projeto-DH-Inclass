package br.com.mgoficina.service;

import br.com.mgoficina.exception.DataIntegrityException;
import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Identifiable;

import java.util.List;

public interface IService<T> {

    T create(T t);

    T findById(Long id) throws ObjectNotFoundException;

    List<T> findAll();

    boolean updateById(Long id, T t) throws ObjectNotFoundException, DataIntegrityException;

    boolean deleteById(Long id) throws ObjectNotFoundException, DataIntegrityException;

    boolean delete(T t);

}
