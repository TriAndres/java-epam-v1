package ru.practicum.numbers.repository;


import ru.practicum.numbers.model.Numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class NumberRepositoryImpl implements NumberRepository {
    private final Map<Long, Numbers> numbersMap = new HashMap<>();

//    public static void main(String[] args) {
//        NumberRepositoryImpl n = new NumberRepositoryImpl();
//        n.create(new Numbers(1L, 44));
//        for (Numbers numb : n.findAll()) {
//            System.out.println(numb.toString());
//        }
//
//    }
    @Override
    public List<Numbers> findAll() {
        return new ArrayList<>(numbersMap.values());
    }

    @Override
    public Numbers create(Numbers numbers) {
        //System.out.println(numbers);
        numbersMap.put(numbers.getId(), numbers);
        return numbers;
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