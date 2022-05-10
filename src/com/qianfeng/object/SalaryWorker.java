package com.qianfeng.object;

public class SalaryWorker {
    private double avgSalary;
    private double maxSalery;
    private double minSalary;
    private String department;

    public double getAvgSalary() {
        return avgSalary;
    }

    public void setAvgSalary(double avgSalary) {
        this.avgSalary = avgSalary;
    }

    public double getMaxSalery() {
        return maxSalery;
    }

    public void setMaxSalery(double maxSalery) {
        this.maxSalery = maxSalery;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "SalaryWorker{" +
                "avgSalary=" + avgSalary +
                ", maxSalery=" + maxSalery +
                ", minSalary=" + minSalary +
                ", department='" + department + '\'' +
                '}';
    }

    public SalaryWorker() {
    }

    public SalaryWorker(double avgSalary, double maxSalery, double minSalary, String department) {
        this.avgSalary = avgSalary;
        this.maxSalery = maxSalery;
        this.minSalary = minSalary;
        this.department = department;
    }
}
