package ru.vsuet.boxes.repository;

import ru.vsuet.boxes.domain.Group;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataBaseGroupRepository implements Repository<Group> {

    // TODO: 07.11.2022 подключение к базе данных
    private final Connection connection;

    public DataBaseGroupRepository(DataBaseConnector connector) {
        this.connection = connector.getConnection();
        try {
            String databaseProductName = this.connection.getMetaData().getDatabaseProductName();
            System.out.println("Data base: " + databaseProductName);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Group find(Long id) {
        String query = "select * from box where id = ?";
        return Optional.of(executeSelect(query, statement -> statement.setLong(1, id), mapper).get(0))
                .orElseThrow(() -> new RuntimeException("No elements found by given id"));
    }

    @Override
    public void save(Group source) {
        String insertQuery = "insert into box (name) values (?)";
        String updateQuery = "update box set name = ? where id = ?";
        int rows;
        if (source.getId() == null) {
            rows = execute(insertQuery, statement -> statement.setString(1, source.getName()));
        } else {
            rows = execute(updateQuery, statement -> {
                statement.setString(1, source.getName());
                statement.setLong(2, source.getId());
            });
        }
        System.out.println("Rows affected: " + rows);
    }

    @Override
    public void remove(Group target) {
        String query = "delete from box where id = ?";
        int rows = execute(query, statement -> statement.setLong(1, target.getId()));
        System.out.println("Rows affected: " + rows);
    }

    @Override
    public List<Group> list() {
        String query = "select * from box";
        return executeSelect(query, null, mapper);
    }

    private int execute(String query, SQLStatementConsumer consumer) {
        try (
                PreparedStatement statement = connection.prepareStatement(query)
        ) {
            consumer.accept(statement);
            return statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error while Repository::save method executing: " + e);
        }
    }

    private <T> List<T> executeSelect(String query, SQLStatementConsumer consumer, Mapper<T> mapper) {
        try (
                PreparedStatement statement = connection.prepareStatement(query);
        ) {
            if (consumer != null ) {
                consumer.accept(statement);
            }
            ResultSet resultSet = statement.executeQuery();
            List<T> boxes = new ArrayList<>();
            while (resultSet.next()) {
                T box = mapper.map(resultSet);
                boxes.add(box);
            }
            return boxes;
        } catch (SQLException e) {
            throw new RuntimeException("Error while Repository::list method executing: " + e);
        }
    }

    private final Mapper<Group> mapper = resultSet -> {
        long idn = resultSet.getLong("id");
        String name = resultSet.getString("name");
        return new Group(idn, name);
    };
}
