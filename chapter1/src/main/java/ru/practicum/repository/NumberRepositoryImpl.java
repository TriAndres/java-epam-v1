package ru.practicum.repository;


import ru.practicum.model.Numb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class NumberRepositoryImpl implements NumberRepository {
    private final Map<Long, Numb> numbersMap = new HashMap<>();

    public static void main(String[] args) {
        NumberRepositoryImpl n = new NumberRepositoryImpl();
        n.create(new Numb(1L, 44));
        for (Numb numb : n.findAll()) {
            System.out.println(numb.toString());
        }

    }
    @Override
    public List<Numb> findAll() {
        return new ArrayList<>(numbersMap.values());
    }

    @Override
    public Numb create(Numb numbers) {
        System.out.println(numbers);
        numbersMap.put(numbers.getId(), numbers);
        return numbers;
    }

    @Override
    public Numb findById(long id) {
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