package com.qianfeng.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestJdbcDelete /**
 * @author ZhangrongHao
 * @date 2022/5/9 17:02
 */{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_longdong?useSSL=false&characterEncoding=utf-8", "root", "root");
            String stuName = "李四";
            String sql = "delete from tb_student where stu_name = ?";
            PreparedStatement prep = connection.prepareStatement(sql);
            prep.setString(1,stuName);
            prep.executeUpdate();

        } catch (ClassNotFoundException e) {e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
