package com.company;

public class Main {

    public static void main(String[] args)
    {
        task44();
        task69();
        task94();
        task119();
        task144();
    }
    public static void task44(){ //Даны натуральные числа n и k. Вычислить sqrt(k(n-1)+sqrt(k*n))
        int n = (int) (Math.random() * 10 + 1);
        int k = (int) (Math.random() * 8 + 2);
        float sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum += Math.sqrt(Math.sqrt(k * (n - 1)) + Math.sqrt(k * n));
        }
        System.out.println("n= " + n + " k = " + k + " sum = " + sum);
    }
    public static void task69() {
        /**
         Начав тренировки, лыжник в первый день пробежал 10 км. Каждый следующий день он увеличивал пробег на 10 % от пробега предыдущего дня. Определить:
         а) пробег лыжника за второй, третий, …, десятый день тренировок;
         б) суммарный путь лыжника за первые 7 дней тренировок;
         в) в какой день он пробежит больше 20 км;
         г) в какой день суммарный пробег за все дни превысит 100 км.
         /*
        **1)
         */
        int days = 10;
        double[] week;
        week = new double[days];
        week[0] = 10;
        for(int i = 0; i < 10; i++)
        {
            if(i == 0)
            {
                System.out.print(i + 1);
                System.out.print(')');
                System.out.println(week[i]);
                continue;
            }
            else
            {
                week[i] = week[i - 1] + (week[i - 1] * 0.1);
                System.out.print(i + 1);
                System.out.print(')');
                System.out.println(week[i]);
            }
        }
        /*
        ** 2)
         */
        float sum_week = 0;
        for(int i = 0; i < 6; i++)
        {
            sum_week += week[i];
        }
        System.out.println("Sum of 7 days= " + sum_week);
        /*
        ** 3)
         */
        for(int i = 0; i < days; i++)
        {
            if(week[i] > 20)
            {
                System.out.println("Day > 20 is: " + (i + 1));
                break;
            }
        }
        /*
        ** 4)
         */
        float sum_20 = 0;
        for(int i = 0; i < days; i++)
        {
            sum_20 += week[i];
            if(sum_20 > 100)
            {
                System.out.println("Days > 100 is: " + (i + 1));
                break;
            }
        }
    }
    public static void task94(){
        //Известна масса каждого предмета из некоторого набора предметов. Определить среднюю массу.
        int size = (int) (Math.random() * 10 + 1);
        float item[] = new float[size];
        float sum = 0;
        for(int i = 0; i < size; i++)
        {
            item[i] = (int) (Math.random() * 10 + 1);
            System.out.println("Масса " + (i + 1) + " предмета " + item[i]);
            sum += item[i];
        }
        double avg = sum / size;
        System.out.println("avg = " + avg);
    }
    public static void task119(){
        //Найти сумму всех n-значных чисел, кратных k (1 ≤ n ≤ 4).
        int n = (int) (Math.random() * 4 + 1);
        System.out.println("Генерируется " + n + "-значное число");
        int k = (int) (Math.random() * 5 + 2);
        System.out.println("Числа которые кратны " + k);
        if(n == 1){
            for(int i = 1; i < 10; i++)
            {
                if(i % k == 0){
                    System.out.println(i);
                }
            }
        }
        if(n == 2)
        {
            for(int i = 10; i < 100; i++)
            {
                if(i % k == 0)
                {
                    System.out.println(i);
                }
            }
        }
        if(n == 3)
        {
            for(int i = 100; i < 1000; i++)
            {
                if(i % k == 0)
                {
                    System.out.println(i);
                }
            }
        }
        if(n == 4)
        {
            for(int i = 1000; i < 10000; i++)
            {
                if(i % k == 0)
                {
                    System.out.println(i);
                }
            }
        }
    }
    public static void task144(){
        //Составить программу-генератор чисел Пифагора, то есть чисел, удовлетворяющих условию а2 + b2 = с2. Определить количество различных троек таких чисел для с < 25.
        int n = 0;
        for(int a = 1; a < 25; a++)
        {
            for(int b = 1; b < 25; b++)
            {
                for(int c = 1; c < 25; c++)
                {
                    if(a * a + b * b == c * c)
                    {
                        System.out.println("a = " + a + " b = " + b + " c = " + c);
                        n = n + 1;
                    }
                }
            }
        }
        System.out.println("К-во троек " + n);
    }
}
