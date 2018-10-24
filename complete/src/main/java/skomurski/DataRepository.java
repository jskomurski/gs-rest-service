package skomurski;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import skomurski.model.Data;

@Repository
public interface DataRepository extends CrudRepository<Data, Long> {
}