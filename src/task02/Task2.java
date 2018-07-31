package task02;

import task01.MyException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2
{
    public void run2() throws Exception
    {
        int amountOfNumbersForMathOperation = 5;
        int units = getUnits();

        applayMathOperationAndPrint(getDoubleInputDataFromConsole(amountOfNumbersForMathOperation, units), units, 3);
    }

    private int getUnits() throws IOException
    {
        System.out.println("Выберите единицы измерения угла:");
        System.out.println("1) Градусы");
        System.out.println("2) Радианы");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputDataFromConsole = reader.readLine();

        return Integer.parseInt(inputDataFromConsole);
    }

    private double[] getDoubleInputDataFromConsole(int amountOfNumbers, int units) throws IOException, MyException
    {
        System.out.println("Выберите способ ввода:");
        System.out.println("1) Вручную");
        System.out.println("2) Произвольный выбор");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputDataFromConsole = reader.readLine();
        int wayToEnterData = Integer.parseInt(inputDataFromConsole);
        switch (wayToEnterData)
        {
            case 1:
            {
                System.out.println("Введите " + amountOfNumbers + " значений углов через пробел:");
                inputDataFromConsole = reader.readLine();
                System.out.println("Выбраны значения: " + inputDataFromConsole);
                break;
            }
            case 2:
            {
                if (units == 1)
                {
                    inputDataFromConsole = "";
                    double j;
                    for (int i = 0; i < amountOfNumbers; i++)
                    {
                        j = Math.random() * 361;
                        inputDataFromConsole = inputDataFromConsole + Double.toString(j) + " ";
                    }
                } else if (units == 2)
                {
                    inputDataFromConsole = "";
                    double j;
                    for (int i = 0; i < amountOfNumbers; i++)
                    {
                        j = Math.random() * 6.28318530717958647;
                        inputDataFromConsole = inputDataFromConsole + Double.toString(j) + " ";
                    }

                }
                System.out.println("Выбраны значения: " + inputDataFromConsole);
                break;
            }
        }
        return convertInputStringOfAnglesToDouble(inputDataFromConsole, amountOfNumbers);
    }

    private void applayMathOperationAndPrint(double[] ang, int ed, int count)
    {
        System.out.println("Сумма синусов = " + getSumSinuses(ang, ed, 5));
        System.out.println("Сумма косинусов = " + getSumCosinuses(ang, ed));
        System.out.println("Разность синусов = " + getRazSinuses(ang, ed));
        System.out.println("Разность косинусов = " + getRazCosinuses(ang, ed, 3));
        System.out.println("Произведение синусов = " + getProizSinuses(ang, ed));
        System.out.println("Произведение косинусов = " + getProizCosinuses(ang, ed));
    }

    private double[] convertInputStringOfAnglesToDouble(String inputDataFromConsole, int count) throws MyException
    {
        double[] angles = new double[count];

        int j = 0;
        String[] split = inputDataFromConsole.split(" ");
        for (String str : split)
        {
            angles[j] = Double.parseDouble(str);
            j++;
        }
        return angles;
    }

    private double getSumSinuses(double[] angles, int type)
    {
        double sum = 0;
        if (type == 1)
        {
            for (double angle : angles)
            {
                sum = sum + Math.sin(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                sum = sum + Math.sin(angle);
            }
        }
        return sum;
    }

    private double getSumSinusesRadian(double[] angles)
    {
        double[] radians = new double[angles.length];
        for (int i = 0; i < angles.length; i++){
            radians[i]=Math.toRadians(angles[i]);
        }

        return getSumSinuses(radians);
    }

    private double getSumSinuses(double[] angles)
    {
        double sum = 0;
        for (double angle : angles)
        {
            sum = sum + Math.sin(angle);
        }
        return sum;
    }

    private double getSumCosinuses(double[] angles, int type)
    {
        double sum = 0;
        if (type == 1)
        {
            for (double angle : angles)
            {
                sum = sum + Math.cos(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                sum = sum + Math.cos(angle);
            }
        }
        return sum;
    }

    private double getRazSinuses(double[] angles, int type)
    {
        double raz = 0;
        if (type == 1)
        {
            for (double angle : angles)
            {
                raz = raz - Math.sin(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                raz = raz - Math.sin(angle);
            }
        }
        return raz;
    }

    private double getRazCosinuses(double[] angles, int type)
    {
        double raz = 0;
        if (type == 1)
        {
            for (double angle : angles)
            {
                raz = raz - Math.cos(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                raz = raz - Math.cos(angle);
            }
        }
        return raz;
    }

    private double getProizSinuses(double[] angles, int type)
    {
        double proiz = 1;
        if (type == 1)
        {
            for (double angle : angles)
            {
                proiz = proiz * Math.sin(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                proiz = proiz * Math.sin(angle);
            }
        }
        return proiz;
    }

    private double getProizCosinuses(double[] angles, int type)
    {
        double proiz = 1;
        if (type == 1)
        {
            for (double angle : angles)
            {
                proiz = proiz * Math.cos(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                proiz = proiz * Math.cos(angle);
            }
        }
        return proiz;
    }

    // перегруженные методы

    private double getSumSinuses(double[] angles, int type, int count)
    {
        double sum = 0;
        if (type == 1)
        {
            for (double angle : angles)
            {
                sum = sum + Math.sin(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                sum = sum + Math.sin(angle);
            }
        }

        return new java.math.BigDecimal(sum).setScale(count, java.math.RoundingMode.UP).doubleValue();
    }

    private double getSumCosinuses(double[] angles, int type, int count)
    {
        double sum = 0;
        if (type == 1)
        {
            for (double angle : angles)
            {
                sum = sum + Math.cos(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                sum = sum + Math.cos(angle);
            }
        }
        return sum;
    }

    private double getRazSinuses(double[] angles, int type, int count)
    {
        double raz = 0;
        if (type == 1)
        {
            for (double angle : angles)
            {
                raz = raz - Math.sin(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                raz = raz - Math.sin(angle);
            }
        }
        return raz;
    }

    private double getRazCosinuses(double[] angles, int type, int count)
    {
        double raz = 0;
        if (type == 1)
        {
            for (double angle : angles)
            {
                raz = raz - Math.cos(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                raz = raz - Math.cos(angle);
            }
        }
        return raz;
    }

    private double getProizSinuses(double[] angles, int type, int count)
    {
        double proiz = 1;
        if (type == 1)
        {
            for (double angle : angles)
            {
                proiz = proiz * Math.sin(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                proiz = proiz * Math.sin(angle);
            }
        }
        return proiz;
    }

    private double getProizCosinuses(double[] angles, int type, int count)
    {
        double proiz = 1;
        if (type == 1)
        {
            for (double angle : angles)
            {
                proiz = proiz * Math.cos(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                proiz = proiz * Math.cos(angle);
            }
        }
        return proiz;
    }

}