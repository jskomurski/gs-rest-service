package skomurski;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import skomurski.model.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class DataController {
    //private AtomicLong generatedID = new AtomicLong();
    //private List<Data> dataz = new ArrayList<>();

    @Autowired
    DataRepository dataRepository;

    @PutMapping("/skomurski/data")
    public Data putData(@RequestBody Data data) {
        // Create auto-generated ID
        // data.setId(generatedID.incrementAndGet());
        // dataRepository.save(data);

        return dataRepository.save(data);

        //TODO
        // check if Data with ID exists, if not, allow create
        /*
        if (currentData == null) {
            // Data with ID not found
            //Throw error OR allow POST?
        }
        */

    }

    @GetMapping("/skomurski/data/{id}")
    public Data getData(@PathVariable("id") Long dataId) {
        return dataRepository.findById(dataId)
                .orElseThrow(() -> new ResourceNotFoundException("Could not find data with id: " + dataId));

        //bad things
        //throw new IllegalArgumentException();
    }

    @DeleteMapping("/skomurski/data/{id}")
    public ResponseEntity<String> deleteData(@PathVariable("id") Long dataId){
        Data data = dataRepository.findById(dataId)
                .orElseThrow(() -> new ResourceNotFoundException("Cannot delete data with id : " + dataId + ". Not found."));

        dataRepository.delete(data);

        //Return a msg
        //return ResponseEntity.ok().build("some");
        return new ResponseEntity<String>("Deleted data: " + data.toString(), HttpStatus.OK);
    }

    // Create Exception Handler
    // TODO
    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Data ID not found, and could not be updated or deleted")
    @ExceptionHandler(IllegalArgumentException.class)
    public void badIdExceptionHandler() {
        // Nothing to do
        //IllegalArgumentException exception
    }
}
