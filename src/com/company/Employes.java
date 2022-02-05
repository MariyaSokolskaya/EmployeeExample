package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Employes  {
    ArrayList<Employee> employees = new ArrayList<>();

    public void add(Employee empl){
        //TODO добавление по алфавиту
        employees.add(empl);
    }
    public void print(){
        //TODO печать списка

    }
    public void del(String tel){
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).tel.equals(tel))
                employees.remove(i);
        }
    }
    public void sortDate(){
        employees.sort(new CompDate());
    }
    //TODO при необходимости написать еще один метод сортировки
    class CompDate implements Comparator<Employee>{

        @Override
        public int compare(Employee employee, Employee t1) {
            //при совпадении правил сравнения
            return employee.compareTo(t1);
            //если сравниваем по другому правилу,
            // то пишем полный алгоритм
        }
    }
}
