package com.anamuc.monedas.controller;

import com.anamuc.monedas.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/")
    public String formulario() {
        return "search";
    }

    @PostMapping("/buscar")
    public String buscar(@RequestParam String pais, Model model) {
        model.addAttribute("resultados", currencyService.getPorPaises(pais));
        model.addAttribute("pais", pais);
        return "search";
    }

} // END Class
