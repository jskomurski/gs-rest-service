package skomurski.service;

import skomurski.model.Data;

import java.util.Collection;

public interface DataService {
    Collection<Data> findAll();

    Data findOne(Long id);

    Data  create(Data data);

    Data update(Data data);

    void delete(Long id);
}
