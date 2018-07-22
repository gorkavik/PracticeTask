package task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1
{
    public void run() throws java.io.IOException, java.text.ParseException
    {
        int amountOfNumbersForMathOperation = 5;
        String inputDataFromConsole = getInputDataFromConsole(amountOfNumbersForMathOperation);

        int j = 0;
        try
        {
            Number[] b = convertStringToDoubleAndCheckOnDigit(inputDataFromConsole, amountOfNumbersForMathOperation);
            applyMathOperationAndPrint(b);
        } catch (MyException e)
        {
            System.out.println(e.getMessage() + ": " + e.getSymbol());
        }
    }

    private String getInputDataFromConsole(int c) throws IOException
    {
        System.out.println("Выберите формат ввода чисел:");
        System.out.println("1) Ввести " + c + " чисел вручную");
        System.out.println("2) Произвольный выбор чисел из диапазона 0...100");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s = read.readLine();
        int vybor = Integer.parseInt(s);
        switch (vybor)
        {
            case 1:
            {
                System.out.println("Введите " + c + " только целых или только дробных числа через пробел:");
                s = read.readLine();
                break;
            }
            case 2:
            {
                System.out.println("Выберите - целые или вещественные числа:");
                System.out.println("1) Целые");
                System.out.println("2) Вещественные");
                s = read.readLine();
                switch (Integer.parseInt(s))
                {
                    case 1:
                    {
                        s = "";
                        double j;
                        for (int i = 0; i < c; i++)
                        {
                            j = Math.floor(Math.random() * 100);
                            s = s + Double.toString(j) + " ";
                        }
                        System.out.println("Выбранные значения: " + s);
                        break;
                    }
                    case 2:
                    {
                        s = "";
                        double j;
                        for (int i = 0; i < c; i++)
                        {
                            j = Math.random() * 100;
                            s = s + Double.toString(j) + " ";
                        }
                        System.out.println("Выбранные значения: " + s);
                        break;
                    }
                }

                break;
            }
        }
        return s;
    }

    private Number[] convertStringToDoubleAndCheckOnDigit(String inputDataFromConsole, int amountOfNumbersForMathOperation) throws MyException, java.text.ParseException
    {
        Number[] num = new Number[amountOfNumbersForMathOperation];
        int j = 0;

        String[] split = inputDataFromConsole.split(" ");

        java.text.NumberFormat instance = java.text.NumberFormat.getInstance();
        for (String str : split)
        {
            num[j] = instance.parse(str);
            j++;
        }

        return num;
    }

    private void applyMathOperationAndPrint(Number[] numbers)
    {
        Number sumNumb = getSumNumbers(numbers);
        System.out.println("Сумма чисел:" + sumNumb.longValue());

        Number razNumb = getRazNumbers(numbers);
        System.out.println("Разность чисел:" + razNumb);

        Number proizNumb = getProizNumbers(numbers);
        System.out.println("Произведение чисел:" + proizNumb);

        Number minNumb = getMinNumbers(numbers);
        System.out.println("Минимальное из чисел:" + minNumb);

        Number maxNumb = getMaxNumbers(numbers);
        System.out.println("Максимальное из чисел:" + maxNumb);

        Number srznachNumber = getSrznachNumbers(numbers);
        System.out.println("Среднее значение чисел:" + srznachNumber);
    }

    private Number getSumNumbers(Number[] numbers)
    {
        Number sum = 0;
        for (Number i : numbers)
            sum = sum.floatValue() + i.floatValue();
        return sum;
    }

    private Number getRazNumbers(Number[] numbers)
    {
        Number raz = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            raz = raz.floatValue() - numbers[i].floatValue();
        return raz;
    }

    private Number getProizNumbers(Number[] numbers)
    {
        Number prioz = 1;
        for (Number i : numbers)
            prioz = prioz.floatValue() * i.floatValue();
        return prioz;
    }

    private Number getMinNumbers(Number[] numbers)
    {
        Number min = 1;
        for (Number i : numbers)
        {
            if (i.floatValue() < min.floatValue())
            {
                min = i;
            }
        }
        return min;
    }

    private Number getMaxNumbers(Number[] numbers)
    {
        Number max = 0;
        for (Number i : numbers)
        {
            if (i.floatValue() > max.floatValue())
            {
                max = i;
            }
        }
        return max;
    }

    private Number getSrznachNumbers(Number[] numbers)
    {
        return getSumNumbers(numbers).floatValue() / numbers.length;
    }
}


