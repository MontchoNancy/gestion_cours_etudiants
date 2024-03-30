package com.etudiant.gestion_cours_etudiants.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class LoginController {
    @RequestMapping("/login_auth")
    public String loginPages(){return "login";}

    @RequestMapping("/register_auth")
    public String registerPages(){return "register";}


    @RequestMapping("/home")
    public String loadingPages(){return "/pages/accueil";}

}
