package ru.practicum.security.model;

import java.time.LocalDateTime;

public class Security {
    private Long id;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private LocalDateTime RegistrationTime;
    private boolean start;


    public Security() {
    }

    public Security(
            Long id,
            String firstName,
            String lastName,
            String login,
            String password,
            LocalDateTime registrationTime,
            boolean start) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.RegistrationTime = registrationTime;
        this.start = start;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getRegistrationTime() {
        return RegistrationTime;
    }

    public void setRegistrationTime(LocalDateTime registrationTime) {
        RegistrationTime = registrationTime;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    @Override
    public String toString() {
        return "Security{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", RegistrationTime=" + RegistrationTime +
                ", start=" + start +
                '}';
    }
}