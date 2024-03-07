package org.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentJdbcRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int countOfStudent() {
       return jdbcTemplate.queryForObject(
               "SELECT count(1) FROM student", Integer.class);
    }

}
