package com.tp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Indique à Spring que cette classe gère des requêtes Web
public class HomeController {

    @RequestMapping("/home") //Associe l'URL "/home" à cette méthode
    public String home() {
        //Retourne le nom logique de la vue (sans .jsp)
        return "home";
    }
}