package task01.printmenu;

import java.io.BufferedReader;

public class GetDataFromConsole
{
    private final int amountOfNumbers;
        public GetDataFromConsole(int amountOfNumbers)
        {
            this.amountOfNumbers = amountOfNumbers;
        }


    public String getData(BufferedReader bufferedReader) throws Exception
    {
        System.out.println("Введите " + amountOfNumbers + " только целых или только дробных числа через пробел:");
        return bufferedReader.readLine();
    }


}
