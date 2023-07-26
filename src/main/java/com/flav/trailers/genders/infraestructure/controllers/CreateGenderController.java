package com.flav.trailers.genders.infraestructure.controllers;

import com.flav.trailers.genders.application.CreateGenderUseCase;
import com.flav.trailers.genders.domain.models.Gender;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/genders")
public class CreateGenderController {

    private final CreateGenderUseCase useCase;

    public CreateGenderController(CreateGenderUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping
    public ResponseEntity<Gender> crate(Gender gender) {
        Gender newGender = useCase.run((gender));

        return ResponseEntity.status(HttpStatus.CREATED).body(newGender);
    }
}
