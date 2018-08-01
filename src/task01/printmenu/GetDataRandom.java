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
        String str="";
        System.out.println("Выберите - целые или вещественные числа:");
        System.out.println("1) Целые");
        System.out.println("2) Вещественные");
        int i = Integer.parseInt(bufferedReader.readLine());
        switch (i)
        {
            case 1:
            {
                str = new Random().getRandomInt(amountOfNumbers);
                break;
            }
            case 2:
            {
                str = new Random().getRandomDouble(amountOfNumbers);
                break;
            }
        }
        System.out.println("Выбранные значения: " + str);
        return str;
    }

}
