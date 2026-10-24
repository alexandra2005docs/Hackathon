package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/recebiveis")
public class RecebivelController {

    @GetMapping
    public List<Recebivel> listar() {
        return LeitorCSV.lerCSV("recebiveis.csv");
    }
    // entendi nd
    
}