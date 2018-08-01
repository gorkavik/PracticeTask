package task01.printmenu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu
{

    public String printMenu(BufferedReader read) throws Exception
    {
        String str="";
        int amount = new GetAmountOfNumbers().getChoose(read);
        int inputMethod = new GetInputMetod(amount).getChoose(read);
        switch (inputMethod)
        {
            case 1:
            {
                str = new GetDataFromConsole(amount).getData(read);
                break;
            }
            case 2:
            {
                str = new GetDataRandom(amount).getData(read);
                break;
            }
        }

        return str;
    }

}
