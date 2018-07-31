package task01.operation;

import java.util.ArrayList;

public class ProizMathOperation implements MathOperation
{
    @Override
    public Number calculate(ArrayList<Number> numbers)
    {
        Number prioz = 1;
        for (Number i : numbers)
        {
            prioz = prioz.floatValue() * i.floatValue();
        }
        return prioz;
    }

    @Override
    public String toString()
    {
        return "Proizvedenie";
    }
}
