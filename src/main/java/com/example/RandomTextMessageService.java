package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Configuration
@Scope("prototype")
public class RandomTextMessageService implements MessageService {
    String[] messages = new String[] {
            "Zainstaluj środowisko IntelliJ IDEA",
            "Uruchom testMyNameMessageServiceTest",
            "Wykonaj fork tego projektu",
            "Volkswagen, das auto",
            "W pliku applicationContext.xml zakomentują linię z <bean></bean>",
            "o klasy MyNameMessageService dodaj adnotację",
            "Usuń z kodu plik applicationContext.xml",
            "Należy wprowadzić takie zmiany",
            "Podpowiedzi jak to zrobić można znaleźć tutaj",
            "upewnij się że Twoje imię i nazwisko jest wyświetlane na ekranie" };

    @Bean
    public String getMessage() {
        Random rand = new Random();
        int randomNum = rand.nextInt(10);
        return messages[randomNum];
    }
}
