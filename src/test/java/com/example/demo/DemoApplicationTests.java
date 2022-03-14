package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    DataSource dataSource;
    @Test
    void getConnection() throws SQLException {
        System.out.println("获取的数据库连接为:"+dataSource.getConnection());
    }
    @Test
    void contextLoads() {
    }

}
