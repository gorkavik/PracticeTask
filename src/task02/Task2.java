package task02;

import task01.MyException;
import task01.Task1;
import task01.operation.*;
import task01.printmenu.GetAmountOfNumbers;
import task01.printmenu.GetInputMetod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;

public class Task2
{
    public void run2(BufferedReader read) throws Exception
    {
        int amountOfNumbersForMathOperation = new GetAmountOfNumbers().getChoose(read);
        int units = getUnits();
        int inputMethod = new GetInputMetod(amountOfNumbersForMathOperation).getChoose(read);
        applayMathOperationAndPrint(getDoubleInputDataFromConsole(amountOfNumbersForMathOperation, units, inputMethod, read), units, 3);
    }

    private int getUnits() throws IOException
    {
        System.out.println("Выберите единицы измерения угла:");
        System.out.println("1) Радианы");
        System.out.println("2) Градусы");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputDataFromConsole = reader.readLine();

        return Integer.parseInt(inputDataFromConsole);
    }

    private ArrayList<Number> getDoubleInputDataFromConsole(int amountOfNumbers, int units, int inputMethod, BufferedReader reader) throws IOException, MyException, ParseException
    {


        String inputDataFromConsole = "";
        switch (inputMethod)
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
        return new Task1().convertStringToListOfNumber(inputDataFromConsole);
    }

    private void applayMathOperationAndPrint(ArrayList<Number> ang, int ed, int count)
    {
        System.out.println("Сумма синусов = " + new SumSinusesMathOperation().calculate(ang, ed, 5));
        System.out.println("Сумма косинусов = " + new SumCosinusesMathOperation().calculate(ang, ed));
        System.out.println("Разность синусов = " + new RazSinusesMathOperation().calculate(ang, ed));
        System.out.println("Разность косинусов = " + new RazCosinusesMathOperation().calculate(ang, ed, 3));
        System.out.println("Произведение синусов = " + new ProizSinusesMathOperation().calculate(ang, ed));
        System.out.println("Произведение косинусов = " + new ProizCosinusesMathOperation().calculate(ang, ed));
    }


}