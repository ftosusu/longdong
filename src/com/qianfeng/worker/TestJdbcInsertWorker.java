package com.qianfeng.worker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestJdbcInsertWorker {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_longdong?useSSL=false&characterEncoding=utf-8", "root", "root");
            String name = "张十";
            int age = 36;
            String department = "销售";
            int salary = 7800;
            String sql="insert into tb_worker (name,age,department,salary) value (?,?,?,?)";
            PreparedStatement prep = connection.prepareStatement(sql);
            prep.setString(1,name);
            prep.setInt(2,age);
            prep.setString(3,department);
            prep.setInt(4,salary);
            prep.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
