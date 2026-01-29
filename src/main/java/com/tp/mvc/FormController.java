package com.tp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    // Méthode GET pour AFFICHER le formulaire
    @GetMapping("/form")
    public String showForm() {
        return "form"; // Renvoie vers /WEB-INF/views/form.jsp
    }

    // Méthode POST pour TRAITER le formulaire
    @PostMapping("/send")
    public String send(@RequestParam String content, Model model) {
        // On récupère le champ du formulaire et on le remet dans le modèle
        model.addAttribute("msg", content);
        return "result"; // Renvoie vers /WEB-INF/views/result.jsp
    }
}