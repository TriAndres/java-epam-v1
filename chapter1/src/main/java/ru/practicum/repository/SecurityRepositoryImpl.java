package ru.practicum.repository;

import ru.practicum.model.Security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecurityRepositoryImpl implements SecurityRepository {
    private final Map<Long, Security> passwordMap = new HashMap<>();

    public List<Security> getSecurityAll() {
        if (!passwordMap.isEmpty()) {
            return new ArrayList<>(passwordMap.values());
        }
        return null;
    }

    public Security create(Security security) {
        if (security != null) {
            if (!passwordMap.containsKey(security.getId())) {
                passwordMap.put(security.getId(), security);
                return security;
            }
        }
        return null;
    }
}