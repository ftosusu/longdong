package com.qianfeng.worker;


import com.qianfeng.object.SalaryWorker;
import java.sql.*;
import java.util.ArrayList;

public class TestSalary {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_longdong?useSSL=false", "root", "root");
            //order by
            //
            String sql = "select avg(salary),max(salary),min(salary),department from tb_worker group by department";
            PreparedStatement prep = connection.prepareStatement(sql);
            ResultSet res = prep.executeQuery();
            ArrayList<SalaryWorker> salaryWorkers = new ArrayList<>();
            while (res.next()){
                double avgSalary = res.getDouble("avg(salary)");
                double maxSalery = res.getDouble("max(salary)");
                double minSalary = res.getDouble("min(salary)");
                String department = res.getString("department");
                SalaryWorker salaryWorker = new SalaryWorker(avgSalary,maxSalery,minSalary,department);
                salaryWorkers.add(salaryWorker);
            }
            System.out.println(salaryWorkers);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
