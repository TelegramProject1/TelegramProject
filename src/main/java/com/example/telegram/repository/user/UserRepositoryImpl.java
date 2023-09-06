package com.example.telegram.repository.user;

import com.example.telegram.model.user.User;
import com.example.telegram.model.user.UserMapper;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository
public class UserRepositoryImpl implements UserRepository {

    private UserRepository userRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    private EntityManager entityManager;

    @Autowired
    private UserMapper userMapper;

    @Override
    public int create(User user) {
        return jdbcTemplate.update(UserSqlQueries.CREATE,
                user.getId(),
                user.getName(),
                user.getUsername(),
                user.getPassword(),
                user.getPhoneNumber(),
                user.getIsActive(),
                user.getCreated(),
                user.getUpdated());
    }


    @Override
    public Optional<User> findById(UUID id) {
        return Optional.ofNullable(jdbcTemplate.queryForObject(
                UserSqlQueries.FIND_BY_ID,
                userMapper,
                id));

    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public int update(User model) {
        return 0;
    }

    @Override
    public int deleteById(UUID id) {
        return 0;
    }

    @Override
    public User getByUsername(String username) {
        return (jdbcTemplate.queryForObject(UserSqlQueries.FIND_BY_USERNAME, userMapper, username));
    }

    @Override
    public User getByPhoneNumber(String phoneNumber) {
        return (jdbcTemplate.queryForObject(UserSqlQueries.FIND_BY_PHONENUMBER, userMapper, phoneNumber));    }

    @Override
    public List<User> findFriendByUsername(String username) {
        username = "%" + username + "%";
        return userRepository.findFriendByUsername(username);

    }
}
