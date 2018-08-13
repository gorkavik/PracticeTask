package task01.printmenu;

import java.io.BufferedReader;

public class GetDataRandom implements GetData
{
    @Override
    public String getData(int amountOfNumbers, BufferedReader bufferedReader) throws Exception
    {

        System.out.println("Выберите - целые или вещественные числа:");
        System.out.println("1) Целые");
        System.out.println("2) Вещественные");
        int type = Integer.parseInt(bufferedReader.readLine());
        String str = new MenuMapRandom(amountOfNumbers).getDataFromSelectMenuItem(type);
        System.out.println("Выбранные значения: " + str);
        return str;
    }

}
