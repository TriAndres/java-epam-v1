package ru.practicum.model;

import java.util.Objects;

public class Numbers {
    private Long id;
    private Integer num;

    public Numbers() {
    }

    public Numbers(
            Long id,
            Integer num
    ) {
        this.id = id;
        this.num = num;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Numbers numbers = (Numbers) o;
        return Objects.equals(id, numbers.id) && Objects.equals(num, numbers.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, num);
    }

    @Override
    public String toString() {
        return id +
                "/" + num;
    }
}