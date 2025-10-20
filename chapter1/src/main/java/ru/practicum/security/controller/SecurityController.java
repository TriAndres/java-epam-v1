package ru.practicum.security.controller;

import ru.practicum.security.repository.SecurityRepositoryImpl;
import ru.practicum.security.service.SecurityServiceImpl;

public class SecurityController {

    public static SecurityRepositoryImpl securityRepository() {
        return new SecurityRepositoryImpl();
    }
    public static SecurityServiceImpl securityService() {
        return new SecurityServiceImpl(securityRepository());
    }
}
