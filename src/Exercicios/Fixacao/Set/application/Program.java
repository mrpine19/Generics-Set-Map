package Exercicios.Fixacao.Set.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> courseA = new HashSet<>();
        Set<Integer> courseB = new HashSet<>();
        Set<Integer> courseC = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            courseA.add(sc.nextInt());
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();

        for (int i=0; i<n; i++){
            courseB.add(sc.nextInt());
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();

        for (int i=0; i<n; i++){
            courseC.add(sc.nextInt());
        }

        //UNITY
        Set<Integer> unity = new HashSet<>(courseA);
        unity.addAll(courseB);
        unity.addAll(courseC);

        System.out.println();
        System.out.println("Total students: " + unity.size());

        sc.close();
    }
}
