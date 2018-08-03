package task01.operation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class SumSinusesMathOperation implements MathOperation
{
    @Override
    public Number calculate(ArrayList<Number> numbers)
    {
        return null;
    }

    @Override
    public Number calculate(ArrayList<Number> numbers, int type)
    {
        Number sum = 0;

        if (type == 1)
        {
            for (Number number : numbers)
            {
                sum = sum.floatValue() + Math.sin(Math.toRadians(number.floatValue()));
            }
        } else if (type == 2)
        {
            for (Number number : numbers)
            {
                sum = sum.floatValue() + Math.sin(number.floatValue());
            }
        }
        return sum;
    }

    @Override
    public Number calculate(ArrayList<Number> numbers, int type, int accuracy)
    {
        Number sum = calculate(numbers, type);
        return new BigDecimal(sum.floatValue()).setScale(accuracy, RoundingMode.UP).doubleValue();
    }
}
