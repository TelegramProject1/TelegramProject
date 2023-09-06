package com.example.telegram.repository.user;

public interface UserSqlQueries {
    String CREATE = """
            insert into users (id,name,username,password,phoneNumber,isActive,created,updated)
            values(?,?,?,?,?,?,?,?);
            """;

    String FIND_BY_ID = "select * from users where id = ?";
    String FIND_BY_USERNAME = "select * from users where username = ?";
    String FIND_BY_PHONENUMBER = "select * from users where phoneNumber = ?";


    String GET_ALL = "select * from users";


}
