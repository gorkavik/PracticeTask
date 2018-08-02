package task01.printmenu;

import java.io.BufferedReader;

public class GetDataRandom
{
    private final int amountOfNumbers;

    public GetDataRandom(int amountOfNumbers)
    {
        this.amountOfNumbers = amountOfNumbers;
    }

    public String getData(BufferedReader bufferedReader) throws Exception
    {

        System.out.println("Выберите - целые или вещественные числа:");
        System.out.println("1) Целые");
        System.out.println("2) Вещественные");
        int type = Integer.parseInt(bufferedReader.readLine());
        String str = new MenuMapGetDataRandom(amountOfNumbers, bufferedReader).getDataFromSelectMenuItem(type);
        System.out.println("Выбранные значения: " + str);
        return str;
    }

}
