package com.qianfeng.object;

/**
 * 自定义的用于
 * 接收根据城市分组，求老师平均年龄结果
 * 的实体类
 */
public class AddressAvgAge {
    private Double avrAge;
    private String address;

    public Double getAvrAge() {
        return avrAge;
    }

    public void setAvrAge(Double avrAge) {
        this.avrAge = avrAge;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AddressAvgAge{" +
                "avrAge=" + avrAge +
                ", address='" + address + '\'' +
                '}';
    }

    public AddressAvgAge() {
    }

    public AddressAvgAge(Double avrAge, String address) {
        this.avrAge = avrAge;
        this.address = address;
    }
}
