package com.example.api.controller;

import com.example.api.model.State;
import com.example.api.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://4.247.29.41:3000") // Allow CORS for this controller
public class StateController {

    @Autowired
    StateRepository repository;

    @PostMapping("/addState")
    public void addState(@RequestBody State state){
        repository.save(state);
    }

    @GetMapping("/states")
    public List<State> getAllStates() {
        return repository.findAll();
    }
}
