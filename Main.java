package com.company;

import javax.sound.sampled.Line;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static int OppositeHouse (int a, int n){
        return n*2-a+1;
    }

    private static String nameShuffle(String ns){
        String[] massive = ns.split(" ");
        return massive[1]+" "+massive[0];
    }

    private static double Discount(int cena, double skidka){
        return cena*skidka/100;
    }

    private static int DifferenceMaxMin(int[] massive){
        int max=massive[0];
        int min=massive[0];
        for (int i=0; i<massive.length; i++){
            if (massive[i]>max) max=massive[i];
            if (massive[i]<min) min=massive[i];
        }
        return Math.abs(max-min);
    }

    private static int Equal(int a, int b, int c){
        int k=0;
        if (a==b && b==c) k=3;
        else if (a==b || b==c || a==c) k=2;
        return k;
    }

    public static String Reverse(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);  //charAt()- метод извлечения символа из строки
        }
        return reverse;
    }

    private static int Programmers (int a, int b, int c){
        int[] massive = new int[]{a, b, c};
        int max=a;
        int min=a;
        for (int i=0; i<3; i++){
            if (massive[i]>max) max = massive[i];
            if (massive[i]<min) min = massive[i];
        }
        return max-min;
    }

    private static boolean GetXO(String s){
        int x=0; int o=0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='x' || s.charAt(i)=='X') x++;
            if (s.charAt(i)=='o' || s.charAt(i)=='O') o++;
        }
        return x==o;
    }

    private static boolean Bomb (String s){
        s=s.toUpperCase(Locale.ROOT);
        return s.contains("BOMB");
    }

    private static boolean SameASCII(String s1, String s2){
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        int sum1=0;
        int sum2=0;
        for (int i=0; i<s1.length(); i++){
            sum1 += str1[i];
        }
        for (int i=0; i<s2.length(); i++){
            sum2 += str2[i];
        }
        return sum1==sum2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1

        System.out.println(OppositeHouse(scan.nextInt(),scan.nextInt()));

        //2

        System.out.println(nameShuffle("Tim Berton"));
        System.out.println(nameShuffle("Donald Trump"));

        //3

        System.out.println(Discount(scan.nextInt(),scan.nextInt()));

        //4

        System.out.println(DifferenceMaxMin(new int[] {-35,-5}));
        System.out.println(DifferenceMaxMin(new int[] {2, 4, 5, 7, 6, 3}));

        //5

        System.out.println(Equal(scan.nextInt(),scan.nextInt(),scan.nextInt()));

        //6

        scan.nextLine();
        String s = scan.nextLine();
        System.out.println(Reverse(s));

        //7

        System.out.println(Programmers(scan.nextInt(), scan.nextInt(), scan.nextInt()));

        //8

        scan.nextLine();
        String str = scan.nextLine();
        System.out.println(GetXO(str));

        //9

        String bom = scan.nextLine();
        if (Bomb(bom)) System.out.println("DUCK!");
        else System.out.println("Relax, there's no bomb");

        //10

        System.out.println(SameASCII(scan.nextLine(),scan.nextLine()));
    }
}
