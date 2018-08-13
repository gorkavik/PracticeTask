package task01.printmenu;


import java.io.BufferedReader;

public interface MenuMap
{
    String getDataFromSelectMenuItem(int inputMethod);

    String getDataFromSelectMenuItem(int inputMethod, int amountOfNumbers, BufferedReader bufferedReader) throws Exception;
}
