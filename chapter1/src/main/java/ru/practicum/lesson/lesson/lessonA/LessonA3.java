package ru.practicum.lesson.lesson.lessonA;

import ru.practicum.lesson.lesson.Lesson;
import ru.practicum.numbers.model.Numbers;
import ru.practicum.numbers.repository.NumberRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

import static ru.practicum.console.Console.getInteger;
import static ru.practicum.lesson.controller.LessonController.lessonService;

public class LessonA3 extends Lesson {
    private List<Integer> list = new ArrayList<>();
    public LessonA3(NumberRepositoryImpl numberRepository) {
        super(numberRepository);
    }

    @Override
    public void game() {
        System.out.println("3. Вывести заданное количество случайных чисел с переходом и без перехода \n" +
                "на новую строку. \n");
        System.out.println("Введите колтчество цифр n:");
        setRandomNum(1, 100);

        System.out.println("\nбез перехода:");
        showNum(0);

        System.out.println("\nс переходом");
        showNum(10);

        deleteId();
    }

    public void setRandomNum(int from, int to) {
        int num = getInteger();
        for (int i = 0; i < num; i++) {
            long id = getNextId();
            int numRun = from + random.nextInt((to - from));
            numberRepository.create(new Numbers(id, numRun));
            list.add(Integer.parseInt(String.valueOf(id)));
        }
    }

    public void showNum(int lineLength) {
        int count = 0;
        for (Numbers numbers : numberRepository.findAll()) {
            count++;
            System.out.print("\t" + numbers);
            if (count == lineLength) {
                System.out.println();
                count = 0;
            }
        }
    }

    public void deleteId() {
        for (Integer id : list) {
            numberRepository.deleteById(id);
        }
    }

    public static void main(String[] args) {
        lessonService().lessonA3();
    }
}