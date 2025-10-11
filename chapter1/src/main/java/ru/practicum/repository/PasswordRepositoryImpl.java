package ru.practicum.repository;

import ru.practicum.model.Password;

import java.util.HashMap;
import java.util.Map;

public class PasswordRepositoryImpl implements PasswordRepository {
    private final Map<Long, Password> passwordMap = new HashMap<>();
}