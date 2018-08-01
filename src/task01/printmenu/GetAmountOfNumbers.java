package task01.printmenu;

import java.io.BufferedReader;

public class GetAmountOfNumbers implements MenuChoose
{

    @Override
    public int getChoose(BufferedReader bufferedReader) throws Exception
    {
        System.out.println("Выберите количество чисел:");
        return Integer.parseInt(bufferedReader.readLine());

    }
}
