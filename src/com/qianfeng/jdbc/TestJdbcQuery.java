package com.qianfeng.jdbc;





import com.qianfeng.object.Student;

import java.sql.*;
import java.util.ArrayList;

public class TestJdbcQuery
/**
 * @author ZhangrongHao
 * @date 2022/5/10 8:39
 *
 */
{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_longdong?useSSL=false&characterEncoding=utf-8", "root", "root");
            String sql = "select * from tb_student";
            PreparedStatement prep = connection.prepareStatement(sql);
            //
            ArrayList<Student> studentArrayList = new ArrayList<>();
            //执行查询操作，结果集
            //res:理解成二位表格
            ResultSet res= prep.executeQuery();
            while (res.next()){
                //获取每列的数据(通过列明)
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
