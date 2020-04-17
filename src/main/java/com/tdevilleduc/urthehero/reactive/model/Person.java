package com.tdevilleduc.urthehero.reactive.model;

public class Person {

    private Integer id;
    private String login;
    private String firstname;

    public Person(int id, String login, String firstname) {
        this.id = id;
        this.login = login;
        this.firstname = firstname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}
