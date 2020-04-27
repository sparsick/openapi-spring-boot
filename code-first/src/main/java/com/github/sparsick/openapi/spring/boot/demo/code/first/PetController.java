package com.github.sparsick.openapi.spring.boot.demo.code.first;

import com.github.sparsick.openapi.spring.boot.demo.code.first.model.Pet;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class PetController {

    /**
     * POST /pet : Add a new pet to the store
     *
     * @param body Pet object that needs to be added to the store (required)
     * @return Invalid input (status code 405)
     */
    @RequestMapping(value = "/pet",
            consumes = { "application/json", "application/xml" },
            method = RequestMethod.POST)
    public ResponseEntity<Void> addPet(@Valid Pet body) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<List<Pet>> findPetsByStatus(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "available, pending, sold") @Valid @RequestParam(value = "status", required = true) List<String> status) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
