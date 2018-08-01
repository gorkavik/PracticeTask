package task01.printmenu;

public class Random
{
    public String getRandomInt(int amountOfNumbers)
    {
        String str = "";
        double j;
        for (int i = 0; i < amountOfNumbers; i++)
        {
            j = Math.floor(Math.random() * 100);
            str = str + Double.toString(j) + " ";
        }

        return str;
    }
    public String getRandomDouble(int amountOfNumbers)
    {
        String str = "";
        double j;
        for (int i = 0; i < amountOfNumbers; i++)
        {
            j = Math.random() * 100;
            str = str + Double.toString(j) + " ";
        }

        return str;
    }
}
