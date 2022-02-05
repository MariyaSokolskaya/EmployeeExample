package com.company;

import java.util.*;

public class Main {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(true){
            Integer k = in.nextInt();
            arrayList.add(k);
            if(k < -100 || k > 100)
                break;
        }
        System.out.println(arrayList);
        arrayList.set(3, -99);
        System.out.println(arrayList);
        arrayList.remove(Integer.valueOf(9));
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, arrayList.get(i) + 2);
        }
        System.out.println(arrayList);
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next() * 2);

        Employes employes = new Employes();
        while (in.nextLine().equals(""))
        employes.add(new Employee());

    }
}
