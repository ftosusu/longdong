package com.qianfeng.jdbc;


/**
 *
 */

import com.qianfeng.object.Student;

import java.sql.*;

/**
 * @author ZhangrongHao
 * @date 2022/5/10 10:41
 */
public class TestJdbcQuerById {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_longdong?useSSL=false", "root", "root");
            int id =7;
            String sql = "select * from tb_student where stu_id  =?";
            PreparedStatement prep = connection.prepareStatement(sql);
            prep.setInt(1,id);
            ResultSet res = prep.executeQuery();
            //游标下移，查看是否存在数据
            if (res.next()){
                int stuId = res.getInt("stu_id");
                String stuName = res.getString("stu_name");
                int stuAge = res.getInt("stu_age");
                String stuHobby = res.getString("stu_hobby");
                Student student = new Student(stuId,stuName,stuAge,stuHobby);
                System.out.println(student);
            }else {
                System.out.println("您查询的用户不存在");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
