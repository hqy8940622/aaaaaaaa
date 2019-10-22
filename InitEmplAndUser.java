package com.kgc.entity;

/**
 * @author: Administrator
 * @Date: 2019/8/29 14:01
 * 初始化数据使用
 */
public class InitEmplAndUser {
    public static Employee[] employees = new Employee[10]; //用来存放员工信息的数组

    public static User[] users = new User[2];//用来存放用户信息的数组

    //使用静态代码块初始化数据
    static{
        employees[0] = new Employee("10001","凡哥",30000);
        employees[1] = new Employee("10002","运哥",24000);
        employees[2] = new Employee("10003","跃哥",40000);

        User user = new User("庭哥","123");
        users[0] = user;
        users[1] = new User("磊哥","123");
    }
}
