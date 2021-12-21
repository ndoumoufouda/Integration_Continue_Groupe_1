package org.isj.calculatriceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class CalculatriceserverApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "choisir l'operation que vous souhaiter effectuer sur notre calculatrice \n" +
                "1 - Addition \n" +
                "2 - soustraction\n" +
                "3 - division \n" +
                "4 - multiplication \n" +
                "5 - Division \n" +
                "toute autre valeur va fermer l'application";
    }
    public static void main(String[] args) {
        SpringApplication.run(CalculatriceserverApplication.class, args);
    }

}
