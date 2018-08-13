package task01.printmenu;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

public class MenuMapGetData implements MenuMap
{
    private Map<Integer, GetData> menuGetData = new HashMap<>();

    public MenuMapGetData()
    {
        menuGetData.put(1, new GetDataFromConsole());
        menuGetData.put(2, new GetDataRandom());
    }

    @Override
    public String getDataFromSelectMenuItem(int inputMethod)
    {
        return null;
    }

    @Override
    public String getDataFromSelectMenuItem(int inputMethod,int amountOfNumbers, BufferedReader bufferedReader) throws Exception
    {
        return menuGetData.get(inputMethod).getData(amountOfNumbers, bufferedReader);
    }

   }
