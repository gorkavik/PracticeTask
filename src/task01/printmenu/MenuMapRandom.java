package task01.printmenu;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

public class MenuMapRandom implements MenuMap
{
    private Map<Integer, String> menuGetDataRandom = new HashMap<>();

    public MenuMapRandom(int amountOfNumbers)
    {
        menuGetDataRandom.put(1, new Random().getRandomInt(amountOfNumbers));
        menuGetDataRandom.put(2, new Random().getRandomDouble(amountOfNumbers));
    }

    @Override
    public String getDataFromSelectMenuItem(int inputMethod)
    {
        return menuGetDataRandom.get(inputMethod);
    }

    @Override
    public String getDataFromSelectMenuItem(int inputMethod, int amountOfNumbers, BufferedReader bufferedReader) throws Exception
    {
        return null;
    }
}
