package task01.operation;

import java.util.ArrayList;
import java.util.Collection;

public class SumMathOperation implements MathOperation
{
    @Override
    public Number calculate(ArrayList<Number> numbers)
    {
        Number sum = 0;
        for (Number i : numbers)
        {
            sum = sum.floatValue() + i.floatValue();
        }
        return sum;
    }

    @Override
    public String toString()
    {
        return "Summa";
    }
}
