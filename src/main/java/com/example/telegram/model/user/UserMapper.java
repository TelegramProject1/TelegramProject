package com.example.telegram.model.user;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class UserMapper implements RowMapper<User> {


    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {

        User user = new User();
        user.setId(UUID.fromString(rs.getString("id")));
        user.setName(rs.getString("name"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setPhoneNumber(rs.getString("phoneNumber"));
        user.setIsActive(rs.getBoolean("isActive"));
        user.setCreated(rs.getTimestamp("created").toLocalDateTime());
        user.setCreated(rs.getTimestamp("updated").toLocalDateTime());
        return  user;
    }
}
