package task01.printmenu;

import java.io.BufferedReader;

public class GetInputMetod implements MenuChoose
{
    private final int amountOfNumbers;

    public GetInputMetod(int amountOfNumbers)
    {
        this.amountOfNumbers = amountOfNumbers;
    }

    @Override
    public int getChoose(BufferedReader bufferedReader) throws Exception
    {
        System.out.println("1) Ввести " + amountOfNumbers + " чисел вручную");
        System.out.println("2) Произвольный выбор чисел из диапазона 0...100");
        return Integer.parseInt(bufferedReader.readLine());
    }
}
