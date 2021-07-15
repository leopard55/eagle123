package com.eagle.javacore.Enum;

/**
 * @Title: EnumDemo
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2020/10/20 10:46
 * @Version: 1.0
 */
public class EnumDemo {
    public static void main(String[] args) {
        //直接引用
        Day day = Day.FRIDAY;
        System.out.println(day);
    }
}

//枚举类型，使用关键字enum
enum Day {
    MONDAY, TUESDAY, WENDESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
