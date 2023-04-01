package com.example.carmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private Repository repository;

    @PostMapping(value = "/people", produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity<People> savePeople(@RequestBody People people) {
        repository.save(people);
        return ResponseEntity
                .ok()
                .body(repository.save(people));
    }
}
