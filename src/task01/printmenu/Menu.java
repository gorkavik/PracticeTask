package task01.printmenu;

import java.io.BufferedReader;

public class Menu
{
    public String printMenu(BufferedReader read) throws Exception
    {
        int amount = new GetAmountOfNumbers().getChoose(read);

        int inputMethod = new GetInputMetod(amount).getChoose(read);

        String str = new MenuMapGetData(amount, read).getDataFromSelectMenuItem(inputMethod);

        return str;
    }
    public int printMenuForInputMethod(BufferedReader read) throws Exception
    {
        int amount = new GetAmountOfNumbers().getChoose(read);

        int inputMethod = new GetInputMetod(amount).getChoose(read);



        return inputMethod;
    }
}
