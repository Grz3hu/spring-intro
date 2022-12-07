package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Scope;

import static org.junit.jupiter.api.Assertions.*;

class MyNameMessageServiceTest {

    @Test
    public void shouldReturnMyNameAsMessage() {
        String expectedMessage = "Grzegorz Swistak";
        MyNameMessageService myNameMessageService = new MyNameMessageService();

        assertEquals(expectedMessage, myNameMessageService.getMessage());
    }
}
