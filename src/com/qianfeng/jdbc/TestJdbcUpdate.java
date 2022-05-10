package com.qianfeng.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestJdbcUpdate /**
 * @author ZhangrongHao
 * @date 2022/5/9 16:47
 */{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_longdong?useSSL=false&characterEncoding=utf-8", "root", "root");
            String name = "姚明";
            int id = 1;
            String sql = "update tb_student set stu_name=? where stu_id=?";
            PreparedStatement prep = connection.prepareStatement(sql);
            prep.setString(1,name);
            prep.setInt(2,id);
            //
            prep.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
