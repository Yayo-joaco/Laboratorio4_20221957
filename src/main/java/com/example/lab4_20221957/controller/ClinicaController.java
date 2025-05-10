package com.example.lab4_20221957.controller;


import com.example.lab4_20221957.repository.ClinicaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clinicas")
public class ClinicaController {
    private final ClinicaRepository clinicaRepository;

    public ClinicaController(ClinicaRepository clinicaRepository) {
        this.clinicaRepository = clinicaRepository;
    }

    @GetMapping(value = {"", "/"})
    public String listaClinicas(Model model) {
        model.addAttribute("listaClinicas", clinicaRepository.findAll());
        return "listaClinica";
    }
}