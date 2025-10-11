package ru.practicum.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Password {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDateTime StartTime;
    private LocalDateTime EndTime;

    public Password() {
    }

    public Password(
            Long id,
            String firstName,
            String lastName,
            LocalDateTime startTime,
            LocalDateTime endTime
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        StartTime = startTime;
        EndTime = endTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getStartTime() {
        return StartTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        StartTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return EndTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        EndTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Password password = (Password) o;
        return Objects.equals(id, password.id) && Objects.equals(firstName, password.firstName) && Objects.equals(lastName, password.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return id +
                "/" + firstName +
                "/" + lastName +
                "/" + StartTime +
                "/" + EndTime;
    }
}