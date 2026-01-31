package com.tp.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class MessageRestController {

    @GetMapping("/api/message")
    public Map<String, String> getMessageApi() {
        // On crée un objet simple (ici une Map)
        Map<String, String> response = new HashMap<>();
        response.put("auteur", "Marko Babic");
        response.put("contenu", "Ceci est du JSON généré via @RestController");

        // Spring va transformer cette Map en JSON automatiquement : {"auteur":..., "contenu":...}
        return response;
    }
}