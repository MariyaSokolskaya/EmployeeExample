package com.company;

import java.util.Date;

public class Employee implements Comparable<Employee>{
    //TODO поля по заданию
    String name;
    String tel;
    //TODO конструктор
    @Override
    public boolean equals(Object obj) {
        //TODO сравнение да/нет
        Employee obj1 = (Employee) obj;
        Date date = new Date("");


        return name.equals(((Employee)obj).name);

    }

    @Override
    public String toString() {
        //TODO для печати
        return super.toString();
    }

    @Override
    public int compareTo(Employee employee) {
        return 0;
    }


}
