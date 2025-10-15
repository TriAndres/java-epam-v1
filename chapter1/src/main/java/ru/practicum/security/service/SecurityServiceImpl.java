package ru.practicum.security.service;

import ru.practicum.security.model.Security;
import ru.practicum.security.repository.SecurityRepositoryImpl;

import java.time.LocalDateTime;

import static ru.practicum.console.Console.getString;

public class SecurityServiceImpl {
    private final SecurityRepositoryImpl securityRepository;

    public SecurityServiceImpl(SecurityRepositoryImpl securityRepository) {
        this.securityRepository = securityRepository;
    }

    public Security registration() {
        Security security = null;
        String line = menu();
        if (line.equals("1")) {
            System.out.println("Введите ваше имя:");
            String firstName = getString();
            System.out.println("Введите вашу фамилию:");
            String secondName = getString();
            System.out.println("Введите логин:");
            String login = getString();
            System.out.println("Введите пароль:");
            String password = getString();
            if (!securityRepository.getSecurityKeyAll().contains(login)) {
                security = securityRepository.create(new Security(
                        getNextId(),
                        firstName,
                        secondName,
                        login,
                        password,
                        LocalDateTime.now(),
                        true
                ));
            }
        } else if (line.equals("2")) {
            System.out.println("Введите логин:");
            String login = getString();
            System.out.println("Введите пароль:");
            String password = getString();
            if (securityRepository.getSecurityKeyAll().contains(login)) {
                for (Security securitys : securityRepository.getSecurityValueAll()) {
                    if (securitys.getPassword().equals(password)) {
                        security = securitys;
                    }
                }
            }
        } else {
            System.out.println("Выход из программы.");
        }
        return security;
    }

    private String menu() {
        System.out.println("""
                Введите действие:
                1 - регистрация.
                2 - вход.
                0 - Выйти из программы.
                """);
        return getString();
    }

    private long getNextId() {
        long currentMaxId = securityRepository
                .getSecurityValueAll()
                .stream()
                .mapToLong(Security::getId)
                .max()
                .orElse(0);
        return ++currentMaxId;
    }
}