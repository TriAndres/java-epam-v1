package ru.practicum.repository;

import ru.practicum.model.Numbers;

import java.util.HashMap;
import java.util.Map;

public class NumberRepositoryImpl implements NumberRepository {
    private final Map<Long, Numbers> numbersMap = new HashMap<>();
}