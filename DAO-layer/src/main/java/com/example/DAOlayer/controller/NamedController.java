package com.example.DAOlayer.controller;

import com.example.DAOlayer.repository.NamedRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NamedController {
    NamedRepository namedRepository;

    public NamedController(NamedRepository namedRepository) {
        this.namedRepository = namedRepository;
    }

    @GetMapping("/products/fetch-product")
    public String getProductName(@RequestParam("name") String name) {
        return namedRepository.getProductName(name);
    }
}
