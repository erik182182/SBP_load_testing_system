package ru.erik182.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.erik182.models.ED701;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ED701Repository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String SQL_GET_ALL = "SELECT * FROM ed701 ORDER BY \"edNo\";";

    private RowMapper<ED701> ed701RowMapper = new RowMapper<ED701>() {
        @Override
        public ED701 mapRow(ResultSet resultSet, int i) throws SQLException {
            return ED701.builder()
                    .edNo(resultSet.getString("edNo"))
                    .edAuthor(resultSet.getString("edAuthor"))
                    .edReceiver(resultSet.getString("edReceiver"))
                    .edAuthor(resultSet.getString("edAuthor"))
                    .transactionID(resultSet.getString("transactionID"))
                    .sum(resultSet.getInt("sum"))
                    .transKind(resultSet.getString("transKind"))
                    .paymentID(resultSet.getString("paymentID"))
                    .accDocNo(resultSet.getString("accDocNo"))
                    .organizationName(resultSet.getString("organizationName"))
                    .personName(resultSet.getString("personName"))
                    .address(resultSet.getString("address"))
                    .bic(resultSet.getString("bic"))
                    .correspAcc(resultSet.getString("correspAcc"))
                    .purpose(resultSet.getString("purpose"))
                    .build();
        }
    };

    public List<ED701> getAll() {
        return jdbcTemplate.query(SQL_GET_ALL, ed701RowMapper);
    }

}
