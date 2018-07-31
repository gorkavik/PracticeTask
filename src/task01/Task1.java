package task01;

import task01.operation.MathOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;

public class Task1
{
    private final Collection<MathOperation> operations;

    public Task1(Collection<MathOperation> operations)
    {
        this.operations = operations;
    }

    public void run1() throws java.io.IOException, java.text.ParseException
    {
        String inputDataFromConsole = getInputDataFromConsole();

        try
        {
            ArrayList<Number> b = convertStringToDoubleAndCheckOnDigit(inputDataFromConsole);
            applyMathOperationAndPrint(b);
        } catch (MyException e)
        {
            System.out.println(e.getMessage() + ": " + e.getSymbol());
        }
    }

    private String getInputDataFromConsole() throws IOException
    {
        int c = 5;

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

    private ArrayList<Number> convertStringToDoubleAndCheckOnDigit(String inputDataFromConsole) throws MyException, java.text.ParseException
    {
        ArrayList<Number> num = new ArrayList<>();
        String[] split = inputDataFromConsole.split(" ");

        NumberFormat instance = NumberFormat.getInstance();
        for (String str : split)
        {
            num.add(instance.parse(str));
        }

        return num;
    }

    private void applyMathOperationAndPrint(ArrayList<Number> numbers)
    {
        for (MathOperation operation : operations)
        {
            Number result = operation.calculate(numbers);
            System.out.println(operation.toString() + ":" + result.longValue());
        }
    }
}


