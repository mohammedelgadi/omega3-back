package com.itdev.omega3back.api;

import com.itdev.omega3back.model.Commande;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CommandeController {
    @GetMapping("/api/commandes")
    public List<Commande> getCommandes(){
        return Arrays.asList(
                new Commande(1, "mohammed"),
                new Commande(2, "achraf")
        );
    }
}
