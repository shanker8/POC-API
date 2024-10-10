package com.example.api.repository;

import com.example.api.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StateRepository extends JpaRepository<State, Long> {

}
