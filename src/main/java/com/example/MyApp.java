package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyNameMessageService.class);
        MessageService messageService1 = applicationContext.getBean(MessageService.class);
        MessageService messageService2 = applicationContext.getBean(MessageService.class);

        System.out.println(messageService1.getMessage());
        System.out.println(messageService2.getMessage());
        System.out.println("messageService1 hash: " + messageService1.hashCode());
        System.out.println("messageService2 hash: " + messageService2.hashCode());

        System.out.println("----------------------");

        ApplicationContext applicationContext3 = new AnnotationConfigApplicationContext(RandomTextMessageService.class);
        MessageService messageService3 = applicationContext3.getBean(MessageService.class);
        MessageService messageService4 = applicationContext3.getBean(MessageService.class);
        System.out.println(messageService3.getMessage());
        System.out.println(messageService4.getMessage());
        System.out.println("messageService3 hash: " + messageService3.hashCode());
        System.out.println("messageService4 hash: " + messageService4.hashCode());
    }
}
