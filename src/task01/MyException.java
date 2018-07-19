package task01;

public class MyException extends Exception
{
    private char symbol;

    public char getSymbol()
    {
        return symbol;
    }

    public MyException(String message, char sym)
    {
        super(message);
        symbol = sym;
    }


}
