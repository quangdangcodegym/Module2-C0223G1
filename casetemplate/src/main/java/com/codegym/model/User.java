package com.codegym.model;

public class User implements IModel<User> {
    private long id;
    private String name;
    private String email;

    private ERole eRole;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ERole geteRole() {
        return eRole;
    }

    public void seteRole(ERole eRole) {
        this.eRole = eRole;
    }

    public User(long id, String name, String email, ERole eRole) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.eRole = eRole;
    }
    public User() {

    }

    @Override
    public void parseData(String line) {
        //1683514051,Quang Dag,quang.dang@codeygym.vn,USER
        String[] items = line.split(",");
        this.setId(Long.parseLong(items[0]));
        this.setName(items[1]);
        this.setEmail(items[2]);
        this.seteRole(ERole.getERoleByName(items[3]));

    }
}
