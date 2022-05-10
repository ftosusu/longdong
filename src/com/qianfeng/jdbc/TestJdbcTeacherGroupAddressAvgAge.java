package com.qianfeng.jdbc;

import com.qianfeng.object.AddressAvgAge;

import java.sql.*;
import java.util.ArrayList;

public class TestJdbcTeacherGroupAddressAvgAge {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_longdong?useSSL=false&characterEncoding=utf-8", "root", "root");
            String sql = "select address,avg(age) from tb_teacher group by address";
            PreparedStatement prep = connection.prepareStatement(sql);
            ResultSet res = prep.executeQuery();
            ArrayList<AddressAvgAge> avgAgeArrayList = new ArrayList<>();
            while (res.next()){
                double avgAge = res.getDouble("avg(age)");
                String address = res.getString("address");
                AddressAvgAge addressAvgAge = new AddressAvgAge(avgAge, address);
                avgAgeArrayList.add(addressAvgAge);
            }
            System.out.println(avgAgeArrayList);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //实体类的创建是根据jdbc查询的结果来创建的
}
