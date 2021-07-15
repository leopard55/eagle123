package com.eagle.javacore.Enum;

/**
 * @Title: OrderStatus
 * @Description: 订单状态枚举
 * @Author: lz
 * @CreateDate: 2020/10/20 10:17
 * @Version: 1.0
 */
public enum OrderStatus {
    //已创建（1）
    CREATED(1,"已创建"),

    PROCESSING(2,"进行中"),

    FINISHED(3,"已完成");

    //属性相关
    //状态取值
    private final int value;
    //状态描述
    private final String description;

    private OrderStatus(int value, String description) {
        this.value = value;
        this.description = description;
    }

    //获取状态取值
    public int getValue() {
        return value;
    }

    //获取状态描述
    public String getDescription() {
        return description;
    }
}

class Test{
    public static void main(String[] args) {
        System.out.println(OrderStatus.CREATED);
    }
}
