package ru.practicum.security.controller;

import ru.practicum.security.repository.SecurityRepositoryImpl;
import ru.practicum.security.service.SecurityServiceImpl;

public class SecurityController {
    private static final SecurityRepositoryImpl securityRepository = new SecurityRepositoryImpl();

    public static SecurityServiceImpl securityService() {
        return new SecurityServiceImpl(securityRepository);
    }
}
