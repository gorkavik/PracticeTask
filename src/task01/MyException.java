package task01;

public class MyException extends Exception
{
    private  char symbol;

    public MyException(String s)
    {
        super(s);
    }

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
