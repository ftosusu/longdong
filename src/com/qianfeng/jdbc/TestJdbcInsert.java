package com.qianfeng.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * jdbc步骤:
 * -1. 在项目中创建lib文件夹  mysql-connector-java.jar
 * 0. 如何让jar包生效: 点击左上角file--->project structure--->
 *              libraries--->点击+-->选择java--->点击lib包--->点击ok即可
 * 1. 加载驱动
 * 2. 获取连接
 * 3. 执行SQL
 * 4. 关闭资源
 */
public class TestJdbcInsert
/**
 * @author ZhangrongHao
 * @date 2022/5/9 16:47
 */
{
    public static void main(String[] args) {

        try {
            //加载驱动
            //解决异常提示快捷键：alt+enter
            Class.forName("com.mysql.jdbc.Driver");
            //2.建立连接
            //参数1. :数据库的地址
            //参数2、3:数据库账号，密码
            //idea调用方法自动填写返回值; .var
            // ?:请求地址与携带参数之间做分隔
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_longdong?useSSL=false&characterEncoding=utf-8", "root", "root");
            String name = "张三";
            int age = 26;
            String hobby = "足球";
            //3. 添加SQL
            // ?:占位符的作用
            String sql = "insert into tb_student (stu_name,stu_age,stu_hobby) values(?,?,?)";
            PreparedStatement prep = connection.prepareStatement(sql);
            //5. 给三个问号赋值
            prep.setString(1,name);
            prep.setInt(2,age);
            prep.setString(3,hobby);
            //6. 执行SQL
            prep.executeUpdate();//既能添加，删除，修改
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
