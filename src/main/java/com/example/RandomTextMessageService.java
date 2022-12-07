package com.example;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("RandomMessageService")
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

    @Override
    public String getMessage() {
        Random rand = new Random();
        int randomNum = rand.nextInt(10);
        return messages[randomNum];
    }
}
