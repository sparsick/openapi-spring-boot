package com.github.sparsick.openapi.spring.boot.demo.contract.first;

import de.github.sparsick.openapi.spring.boot.contract.first.api.PetsApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController implements PetsApi {

    @Override
    public ResponseEntity<Void> createPets() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
