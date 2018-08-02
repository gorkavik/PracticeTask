package task01.printmenu;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

public class MenuMapGetData implements MenuMap
{
    private Map<Integer, String> menuGetData = new HashMap<>();

    public MenuMapGetData(int amountOfNumbers, BufferedReader bufferedReader) throws Exception
    {
        menuGetData.put(1, new GetDataFromConsole(amountOfNumbers).getData(bufferedReader));
        menuGetData.put(2, new GetDataRandom(amountOfNumbers).getData(bufferedReader));
    }

    @Override
    public String getDataFromSelectMenuItem(int inputMethod)
    {
        return menuGetData.get(inputMethod);
    }
}
