package ru.practicum.repository;

import ru.practicum.model.Security;

import java.util.HashMap;
import java.util.Map;

public class SecurityRepositoryImpl implements SecurityRepository {
    private final Map<Long, Security> passwordMap = new HashMap<>();
}