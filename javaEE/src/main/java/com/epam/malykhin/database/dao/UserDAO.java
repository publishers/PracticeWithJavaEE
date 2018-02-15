package com.epam.malykhin.database.dao;

import com.epam.malykhin.database.entity.User;

import java.sql.Connection;
import java.sql.SQLException;


public interface UserDAO {
    boolean update(Connection conn, User user) throws SQLException;

    User selectUserByEmail(Connection conn, User user) throws SQLException;

    User select(Connection conn, User user) throws SQLException;

    boolean delete(Connection conn, User user);

    boolean insert(Connection conn, User user) throws SQLException;
}
