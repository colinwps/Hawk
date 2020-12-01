package com.colinapp.hawk;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class HawkApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
        String sql = (String) jdbcTemplate.queryForObject("SELECT userName FROM sys_user WHERE userId= ?",new Object[]{"8001"},String.class);
        System.out.println(sql);

    }

}
