package ru.practicum.repository;


import ru.practicum.model.Numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberRepositoryImpl implements NumberRepository {
    private final Map<Long, Numbers> numbersMap = new HashMap<>();

    @Override
    public List<Numbers> findAll() {
        return new ArrayList<>(numbersMap.values());
    }

    @Override
    public Numbers create(Numbers numbers) {
        return numbersMap.put(numbers.getId(), numbers);
    }

    @Override
    public Numbers update(Numbers numbers) {
        return numbersMap.put(numbers.getId(), numbers);
    }

    @Override
    public Numbers findById(long id) {
        return numbersMap.get(id);
    }

    @Override
    public void deleteById(long id) {
        numbersMap.remove(id);
    }

    @Override
    public void deleteAll() {
        numbersMap.clear();
    }
}