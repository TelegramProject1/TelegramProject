package com.example.telegram.repository.user;

public interface UserSqlQueries {
    String CREATE = """
            insert into users (id,name,username,password,phoneNumber,isActive,created,updated)
            values(?,?,?,?,?,?,?);
            """;

    String FIND_BY_ID = "select * from users where id = ?;";
//
//    String GET_ALL = "select * from todo_user";
//    String UPDATE = "update todo_user set ? = ? where ?=?; ";
//    String FIND_BY_USERNAME = "select * from todo_user where username = ?;";


}
