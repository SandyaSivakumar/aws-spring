package com.sandya.aws.controller;

import com.sandya.aws.model.Developer;
import com.sandya.aws.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    Repository repository;

    @GetMapping("/developers")
    public ResponseEntity<List<Developer>> getDevelopers(){
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/developer")
    public Developer add(@RequestBody Developer developer) {
        return repository.save(developer);
    }


}
