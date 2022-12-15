package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceApplication {

    /**
     * Сделать сервис на SpringBoot + Gradle
     * Должен принимать get и post запросы и возвращать Json сюрелзуя его из датафайла
     *
     * что такое датафайл? каким он должен быть? -Это файл БД
    */
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
