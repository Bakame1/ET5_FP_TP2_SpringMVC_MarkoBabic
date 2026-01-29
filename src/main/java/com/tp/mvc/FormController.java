package com.tp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    private final MessageService service;

    // Injection de dépendance par le constructeur
    @Autowired
    public FormController(MessageService service) {
        this.service = service;
    }

    // Méthode GET pour AFFICHER le formulaire
    @GetMapping("/form")
    public String showForm() {
        return "form"; // Renvoie vers /WEB-INF/views/form.jsp
    }

    // Méthode POST pour TRAITER le formulaire
    @PostMapping("/send")
    public String send(@RequestParam String content, Model model) {
        // On délègue le traitement au service
        String processedMessage = service.process(content);
        model.addAttribute("msg", processedMessage);
        return "result";// Renvoie vers /WEB-INF/views/result.jsp
    }
}