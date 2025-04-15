package io.github.ansh1kaa.unikart;

import org.springframework.boot.SpringApplication;

public class TestUnikartApplication {

    public static void main(String[] args) {
        SpringApplication.from(UnikartApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
