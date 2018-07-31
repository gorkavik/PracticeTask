package task01.operation;

import java.util.ArrayList;

public class MaxMathOperation implements MathOperation
{
    @Override
    public Number calculate(ArrayList<Number> numbers)
    {
        Number max = 0;
        for (Number i : numbers)
        {
            if (i.floatValue() > max.floatValue())
            {
                max = i;
            }
        }
        return max;
    }

    @Override
    public String toString()
    {
        return "maximum";
    }
}
