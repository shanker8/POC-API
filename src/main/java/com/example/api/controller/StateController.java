package com.example.api.controller;

import com.example.api.model.State;
import com.example.api.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://4.247.29.41:3000") // Allow CORS for this controller
public class StateController {

    @Autowired
    StateRepository repository;

    @PostMapping("/addState")
    public ResponseEntity<State> addState(@RequestBody State state) {
        try {
            State savedState = repository.save(state);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedState);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    @GetMapping("/states")
    public List<State> getAllStates() {
        return repository.findAll();
    }
}
