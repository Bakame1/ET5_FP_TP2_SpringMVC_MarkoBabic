package com.tp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {

    @RequestMapping("/message")
    public String message(Model model) {
        // On ajoute un attribut "msg" qui sera accessible dans le fichier JSP
        model.addAttribute("msg", "Bonjour Spring MVC");
        return "message"; //Nom de la vue (message.jsp)
    }
}