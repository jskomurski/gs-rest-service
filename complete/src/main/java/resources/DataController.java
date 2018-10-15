package resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class DataController {
    private AtomicLong generatedID = new AtomicLong();
    private List<Data> dataz = new ArrayList<>();

    @PutMapping("/resources/data")
    public Data putData(@RequestBody Data data) {
        // Create auto-generated ID
        data.setId(generatedID.incrementAndGet());
        dataz.add(data);

        return data;

        //TODO
        // check if Data with ID exists, if not, allow create
        /*
        if (currentData == null) {
            // Data with ID not found
            //Throw error OR allow POST?
        }
        */

    }

    @GetMapping("/resources/data/{id}")
    public Data getData(@PathVariable("id") long dataId) {
        //iterate over list
        for (Data data : dataz) {
            if (data.getId() == dataId) {
                return data;
            }
        }
        //bad things
        throw new IllegalArgumentException();
    }

    @DeleteMapping("/resources/data/{id}")
    public ResponseEntity<String> deleteData(@PathVariable("id") long dataId){
        //TODO
        // find data by ID and delete
        return new ResponseEntity<String>("Deleted data:", HttpStatus.OK);

        // if not found
        // throw new IllegalArgumentException();
    }

    // Create Exception Handler
    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Data ID not found, and could not be updated or deleted")
    @ExceptionHandler(IllegalArgumentException.class)
    public void badIdExceptionHandler() {
        // Nothing to do
        //IllegalArgumentException exception
    }
}
