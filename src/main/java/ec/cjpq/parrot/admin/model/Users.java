package ec.cjpq.parrot.admin.model;

import lombok.Data;

@Data
public class Users {
    private int id;
    private String username;
    private String password;
    private boolean active;
}

