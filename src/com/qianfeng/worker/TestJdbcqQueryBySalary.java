package com.qianfeng.worker;

import com.qianfeng.object.Worker;

import java.sql.*;
import java.util.ArrayList;

public class TestJdbcqQueryBySalary {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_longdong?useSSL=false", "root", "root");
            //order by
            //
            String sql = "select * from tb_worker order by salary desc limit 0,5";
            PreparedStatement prep = connection.prepareStatement(sql);
            ResultSet res = prep.executeQuery();
            ArrayList<Worker> workers = new ArrayList<>();
            while (res.next()){
                int id = res.getInt("id");
                String name = res.getString("name");
                int age = res.getInt("age");
                String department = res.getString("department");
                int salary = res.getInt("salary");
                Worker worker = new Worker(id,name,age,department,salary);
                workers.add(worker);
            }
            System.out.println(workers);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
