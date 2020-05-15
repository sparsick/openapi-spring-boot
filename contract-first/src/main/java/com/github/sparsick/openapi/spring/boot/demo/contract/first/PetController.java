package com.github.sparsick.openapi.spring.boot.demo.contract.first;

import de.github.sparsick.openapi.spring.boot.contract.first.api.PetsApi;
import de.github.sparsick.openapi.spring.boot.contract.first.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PetController implements PetsApi {

    @Override
    public ResponseEntity<Void> createPets() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Pet>> listPets(@Valid Integer limit) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Pet> showPetById(String petId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
