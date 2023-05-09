package com.codegym.model;

public enum ERole {
    ADMIN, USER;
    public static ERole getERoleByName(String name) {
        for (ERole eRole : ERole.values()) {
            if (eRole.toString().equals(name)) {
                return eRole;
            }
        }
        return null;
    }
}
