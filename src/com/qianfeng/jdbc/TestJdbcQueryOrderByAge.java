package com.qianfeng.jdbc;

import com.qianfeng.object.Student;

import java.sql.*;
import java.util.ArrayList;

public class TestJdbcQueryOrderByAge {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_longdong?useSSL=false", "root", "root");
            //order by
            //
            String sql = "select * from tb_student order by stu_age desc";
            PreparedStatement prep = connection.prepareStatement(sql);
            ResultSet res = prep.executeQuery();
            ArrayList<Student> studentArrayList = new ArrayList<>();
            while (res.next()) {
                int stuId = res.getInt("stu_id");
                String stuName = res.getString("stu_name");
                int stuAge = res.getInt("stu_age");
                String stuHobby = res.getString("stu_hobby");
                Student student = new Student(stuId, stuName, stuAge, stuHobby);
                studentArrayList.add(student);
            }
            System.out.println(studentArrayList);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
