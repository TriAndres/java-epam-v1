package ru.practicum.security.repository;

import ru.practicum.security.model.Security;


import java.util.List;

public interface SecurityRepository {
    List<String> getSecurityKeyAll();

    List<Security> getSecurityValueAll();

    Security create(Security security);

    Security findById(long id);
}
