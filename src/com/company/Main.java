package com.company;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //printNumber();
        //printAreaRound();
        //printPromien();
        //3printSRII();
        //printunoduo();
        //printprostek();

        //ZADANIA DRUGIE
        //printparzystaornot();
        //printujemna();
        //printnajmniejsza();
        printrok();

    }

        public static void printAreaRound()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj miarę boku 1");
            Integer bok = scanner.nextInt();
            System.out.println("Podaj miarę boku 2");
            Integer bok2 = scanner.nextInt();
            int wynik = bok * bok2;

            System.out.println("Pole=" + wynik);
            System.out.println("Obwod=" + ((bok * 2) + (bok2 * 2)));
        }

        public static void printNumber()
        {
            Scanner scanner = new Scanner(System.in);
            int liczba = scanner.nextInt();

            System.out.println("liczba: " + liczba);
            System.out.println("szescian: " + liczba*liczba*liczba);
        }
        public static void printPromien()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj promien podstawy(r): ");
            Integer promien = scanner.nextInt();
            System.out.println("Podaj wysokosc(h): ");
            Integer wysokosc = scanner.nextInt();
            float pi = 3.1416f;
            float wynik = (( pi * (promien * promien) * wysokosc)/3);
            float polewynik = ((pi*(promien*promien) + (pi*promien*(float)(Math.sqrt((wysokosc*wysokosc)+(promien*promien))))));

            System.out.println("Objetosc " + wynik);
            System.out.println("Pole " + polewynik);

        }
        public static void printSRII()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz cyfre 1: ");
            Integer cyfra1  = scanner.nextInt();
            System.out.println("Wpisz cyfre 2: ");
            Integer cyfra2  = scanner.nextInt();

            float wynik = (cyfra1*cyfra2);
            float wynik2 = (cyfra1/cyfra2);
            float wynik3 = (cyfra1+cyfra2);
            float wynik4 = (cyfra1-cyfra2);

            if(cyfra1 < cyfra2)
            {
                System.out.println("Ioraz= " + cyfra2/cyfra1);
            }
            else
            {
                System.out.println("Iloraz= " + wynik2);
            }

            System.out.println("Iloczyn= " + wynik);

            System.out.println("Suma= " + wynik3);
            System.out.println("Różnica= " + Math.abs(wynik4));
        }
        public static void printunoduo()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz cyfre 1: ");
            Integer cyfra1  = scanner.nextInt();
            System.out.println("Wpisz cyfre 2: ");
            Integer cyfra2  = scanner.nextInt();

            float wynik = (cyfra1*cyfra2);
            float reszta = (cyfra1%cyfra2);

            if(cyfra1 < cyfra2)
            {
                System.out.println("Reszta= " + cyfra2/cyfra1);
            }
            else
            {
                System.out.println("Reszta= " + reszta);
            }

            System.out.println("Iloraz= " + wynik);

        }
        public static void printprostek()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz ramie podstawy1: ");
            Integer bok1 = scanner.nextInt();
            System.out.println("Wpisz ramei podstawy2: ");
            Integer bok2 = scanner.nextInt();
            System.out.println("Wpisz wysokosc: ");
            Integer bok3 = scanner.nextInt();

            float objetosc = (bok1*bok2*bok3);
            float pole = (((bok1*bok2)*2)+((bok2*bok3)*2)+((bok1*bok3)*2));

            System.out.println("Objetosc prostopadloscianu= " + objetosc);
            System.out.println("Pole= " + pole);

        }

        public static void printparzystaornot()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz liczbę: ");
            Integer liczba = scanner.nextInt();


            float reszta = (liczba%2);

            if(reszta==0)
            {

                System.out.println("Parszysta" );


            }
            else
            {
                System.out.println("NIeparzysta");
            }


        }
        public static void printujemna()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz liczbę: ");
            Integer liczba = scanner.nextInt();

            boolean ujemna = (liczba<0);
            boolean dodatnia = (liczba>0);
            boolean rowna = (liczba==0);

            if(ujemna)
            {
                System.out.println("Ujemna" );
            }
            if(dodatnia)
            {
                System.out.println("dodatnia" );
            }
            if(rowna)
            {
                System.out.println("zeroo" );
            }



        }
        public static void printnajmniejsza()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz liczbę1: ");
            Integer liczba1 = scanner.nextInt();
            System.out.println("Wpisz liczbę2: ");
            Integer liczba2 = scanner.nextInt();
            System.out.println("Wpisz liczbę3: ");
            Integer liczba3 = scanner.nextInt();

            if(liczba1 > liczba2 && liczba1 > liczba3)
            {
                System.out.println(liczba1);
            }
            else if (liczba2 >liczba3)
            {
                System.out.println(liczba2);
            }
            else
            {
                System.out.println(liczba3);
            }

            if(liczba1 <liczba2 && liczba1 < liczba3)
            {
                System.out.println(liczba1);
            }
            else if (liczba2 < liczba3)
            {
                System.out.println(liczba2);
            }
            else
            {
                System.out.println(liczba3);
            }



        }
        public static void printrok()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz rok: ");
            Integer liczba1 = scanner.nextInt();
        }

    }

