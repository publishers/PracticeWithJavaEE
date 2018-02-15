package com.epam.malykhin.database.transaction;

import java.sql.Connection;
import java.sql.SQLException;


public interface TransactionOperation<T> {
    T doInTransaction(Connection connection) throws SQLException;
}