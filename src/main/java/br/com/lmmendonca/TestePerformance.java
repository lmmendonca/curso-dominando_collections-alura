package br.com.lmmendonca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestePerformance {

    public static void main(String[] args) {

        long init = System.currentTimeMillis();

        List<Integer> list = new ArrayList<>();

//        Set<Integer> list = new HashSet<>();

        for(int i = 0; i< 50000; i++) list.add(i);

        System.out.println(System.currentTimeMillis() - init);

        list.forEach(numero -> list.contains(numero));

        System.out.println(System.currentTimeMillis() - init);

    }
}
