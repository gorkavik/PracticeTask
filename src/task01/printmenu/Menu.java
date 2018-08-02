package task01.printmenu;

import java.io.BufferedReader;

public class Menu
{
    public String printMenu(BufferedReader read) throws Exception
    {
        int amount = new GetAmountOfNumbers().getChoose(read);
        System.out.println("Выбор: " + amount);
        int inputMethod = new GetInputMetod(amount).getChoose(read);
        System.out.println("Выбор: " + inputMethod);
        String str = new MenuMapGetData(amount, read).getDataFromSelectMenuItem(inputMethod);
        System.out.println("Выбор: " + str);
        return str;
    }
}
