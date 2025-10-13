package ru.practicum.repository;

import ru.practicum.model.Security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecurityRepositoryImpl implements SecurityRepository {
    private final Map<Long, Security> passwordMap = new HashMap<>();


    public List<String> getSecurityKeyAll() {
        List<String> list = new ArrayList<>();
        for (Security value : passwordMap.values()) {
            list.add(value.getLogin());
        }
        return list;
    }

    public List<Security> getSecurityValueAll() {
        return new ArrayList<>(passwordMap.values());
    }

    public Security create(Security security) {
        passwordMap.put(security.getId(), security);
        return security;
    }

    public Security findById(long id) {
        return passwordMap.get(id);
    }
}