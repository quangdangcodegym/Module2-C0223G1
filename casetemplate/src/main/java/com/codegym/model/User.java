package com.codegym.model;

public class User implements IModel<User> {
    private long id;
    private String name;
    private String email;
    private String password;

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

    public User(long id, String name, String email,String password,  ERole eRole) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.eRole = eRole;
        this.password = password;
    }
    public User() {

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void parseData(String line) {
        //1683514051,Quang Dag,quang.dang@codeygym.vn,123123,USER
        String[] items = line.split(",");
        this.setId(Long.parseLong(items[0]));
        this.setName(items[1]);
        this.setEmail(items[2]);
        this.seteRole(ERole.getERoleByName(items[4]));
        this.setPassword(items[3]);

    }
}
