package com.colinapp.hawk;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class HawkApplicationTests {

    //@Autowired
    //JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;
    Logger logger =   LoggerFactory.getLogger(getClass());
    @Test
    void contextLoads() throws SQLException {
        //String sql = (String) jdbcTemplate.queryForObject("SELECT userName FROM sys_user WHERE userId= ?",new Object[]{"8001"},String.class);
       // System.out.println(sql);
        System.out.println(dataSource.getClass());
        try{
            Connection connection = dataSource.getConnection();
            System.out.println(connection);
            connection.close();

        }catch (Exception e){
            throw e;
        }


    }
    @Test
    void logTest(){
      logger.trace("trace");
      logger.debug("dubug");
      logger.warn("warn");
      logger.info("info");
      logger.error("error");


    }

}
