package com.github.sparsick.openapi.spring.boot.demo.contract.first;

import de.github.sparsick.openapi.spring.boot.contract.first.api.PetApi;
import de.github.sparsick.openapi.spring.boot.contract.first.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PetController implements PetApi {

    @Override
    public ResponseEntity<Void> addPet(@Valid Pet body) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
