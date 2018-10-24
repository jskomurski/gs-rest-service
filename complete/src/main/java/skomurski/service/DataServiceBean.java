package skomurski.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import skomurski.model.Data;
import skomurski.DataRepository;

import java.util.Collection;
import java.util.Objects;

//@Service
//public class DataServiceBean implements DataService {

public class DataServiceBean {
/*
    @Autowired
    private DataRepository dataRepository;

    @Override
    public Collection<Data> findAll() {
        Collection<Data> data = dataRepository.findAll();
        return data;
    }

    @Override
    public Data findOne(Long id) {
        Data data = dataRepository.getOne(id);
        return data;
    }

    @Override
    public Data create(Data data) {

        // Ensure the entity object to be created does NOT exist in the
        // repository. Prevent the default behavior of save() which will update
        // an existing entity if the entity matching the supplied id exists.
        if (Objects.isNull(data.getId())){
            // Cannot create Greeting with specified ID value
            return null;
        }

        Data savedData = dataRepository.save(data);
        return savedData;
    }

    @Override
    public Data update(Data data) {
        // Ensure the entity object to be updated exists in the repository to
        // prevent the default behavior of save() which will persist a new
        // entity if the entity matching the id does not exist
        Data dataToUpdate = findOne(data.getId());
        if (dataToUpdate == null) {
            // Cannot update Greeting that hasn't been persisted
            return null;
        }

        //TODO update all props
        //dataToUpdate.setText(data.getText());
        Data updatedGreeting = dataRepository.save(dataToUpdate);

        return updatedGreeting;
    }

    @Override
    public void delete(Long id) {
        dataRepository.deleteById(id);
    }

*/
}
