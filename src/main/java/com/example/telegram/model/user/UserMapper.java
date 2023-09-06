package com.example.telegram.model.user;

import com.example.telegram.dto.userDto.UserRequestDto;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
@Component
public class UserMapper implements RowMapper<User> {


    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {

        User user = new User();
        user.setId(UUID.fromString(rs.getString("id")));
        user.setName(rs.getString("name"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setPhoneNumber(rs.getString("phonenumber"));
        user.setIsActive(rs.getBoolean("isactive"));
        user.setCreated(rs.getTimestamp("created").toLocalDateTime());
        user.setCreated(rs.getTimestamp("updated").toLocalDateTime());
        return  user;

    }
}
