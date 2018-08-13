package task01.printmenu;

import java.io.BufferedReader;


public class GetDataFromConsole implements GetData
{
    @Override
    public String getData(int amountOfNumbers, BufferedReader bufferedReader) throws Exception
    {
        System.out.println("Введите " + amountOfNumbers + " только целых или только дробных числа через пробел:");
        return bufferedReader.readLine();
    }


}
