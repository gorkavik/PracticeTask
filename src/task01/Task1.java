package task01;

import task01.operation.MathOperation;
import task01.printmenu.Menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;

public class Task1
{
    private final Collection<MathOperation> operations;
    private final Menu menu;

    public Task1(Collection<MathOperation> operations, Menu menu)
    {
        this.operations = operations;
        this.menu = menu;
    }

    public void run1(BufferedReader read) throws Exception, ParseException
    {
        String inputDataFromConsole = menu.printMenu(read);

        try
        {
            ArrayList<Number> b = convertStringToDoubleAndCheckOnDigit(inputDataFromConsole);
            applyMathOperationAndPrint(b);
        } catch (MyException e)
        {
            System.out.println(e.getMessage() + ": " + e.getSymbol());
        }
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


