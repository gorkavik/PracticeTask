package task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task1
{


    public static void main(String[] args) throws Exception
    {
        System.out.println("Введите только целые или только дробные числа:");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int c = 5;
        int[] a = new int[c];
        double[] b = new double[c];

        int j = 0;

        for (int i = 0; i < c; i++)
        {
            s = read.readLine();
            b[i] = Double.parseDouble(s);
            if (b[i] % 1 == 0)
            {
                a[i] = Integer.parseInt(s);
                j++;
            }

        }
        if (j == c)
        {
            getInteger(a);
        } else if (j == 0)
        {
            getDouble(b);
        } else
        {
            System.out.println("Не корректный ввод");
        }

    }


    private static void getInteger(int[] numbers)
    {
        int sumNumb = getSumNumbers(numbers);
        System.out.println("Сумма чисел:" + sumNumb);

        int razNumb = getRazNumbers(numbers);
        System.out.println("Разность чисел:" + razNumb);

        int proizNumb = getProizNumbers(numbers);
        System.out.println("Произведение чисел:" + proizNumb);

        int minNumb = getMinNumbers(numbers);
        System.out.println("Минимальное из чисел:" + minNumb);

        int maxNumb = getMaxNumbers(numbers);
        System.out.println("Максимальное из чисел:" + maxNumb);

        int srznachNumber = getSrznachNumbers(numbers);
        System.out.println("Среднее значение чисел:" + srznachNumber);
    }

    private static void getDouble(double[] numbers)
    {
        double sumNumb = getSumNumbers(numbers);
        System.out.println("Сумма чисел:" + sumNumb);

        double razNumb = getRazNumbers(numbers);
        System.out.println("Разность чисел:" + razNumb);

        double proizNumb = getProizNumbers(numbers);
        System.out.println("Произведение чисел:" + proizNumb);

        double minNumb = getMinNumbers(numbers);
        System.out.println("Минимальное из чисел:" + minNumb);

        double maxNumb = getMaxNumbers(numbers);
        System.out.println("Максимальное из чисел:" + maxNumb);

        double srznachNumber = getSrznachNumbers(numbers);
        System.out.println("Среднее значение чисел:" + srznachNumber);
    }


    // for int
    private static int getSumNumbers(int[] numbers)
    {
        int sum = 0;
        for (int i : numbers)
            sum = sum + i;
        return sum;
    }

    private static int getRazNumbers(int[] numbers)
    {
        int raz = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            raz = raz - numbers[i];
        return raz;
    }

    private static int getProizNumbers(int[] numbers)
    {
        int prioz = 1;
        for (int i : numbers)
            prioz = prioz * i;
        return prioz;
    }

    private static int getMinNumbers(int[] numbers)
    {
        int min = 1;
        for (int i : numbers)
        {
            if (i < min)
                min = i;
        }
        return min;
    }

    private static int getMaxNumbers(int[] numbers)
    {
        int max = 0;
        for (int i : numbers)
        {
            if (i > max)
                max = i;
        }
        return max;
    }

    private static int getSrznachNumbers(int[] numbers)
    {
        return getSumNumbers(numbers) / numbers.length;
    }

    //for double
    private static double getSumNumbers(double[] numbers)
    {
        double sum = 0;
        for (double i : numbers)
            sum = sum + i;
        return sum;
    }

    private static double getRazNumbers(double[] numbers)
    {
        double raz = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            raz = raz - numbers[i];
        return raz;
    }

    private static double getProizNumbers(double[] numbers)
    {
        double prioz = 1;
        for (double i : numbers)
            prioz = prioz * i;
        return prioz;
    }

    private static double getMinNumbers(double[] numbers)
    {
        double min = 1;
        for (double i : numbers)
        {
            if (i < min)
                min = i;
        }
        return min;
    }

    private static double getMaxNumbers(double[] numbers)
    {
        double max = 0;
        for (double i : numbers)
        {
            if (i > max)
                max = i;
        }
        return max;
    }

    private static double getSrznachNumbers(double[] numbers)
    {
        return getSumNumbers(numbers) / numbers.length;
    }
}
