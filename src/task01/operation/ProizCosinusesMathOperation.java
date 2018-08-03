package task01.operation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class ProizCosinusesMathOperation implements MathOperation
{
    @Override
    public Number calculate(ArrayList<Number> numbers)
    {
        return null;
    }

    @Override
    public Number calculate(ArrayList<Number> numbers, int type)
    {
        Number proiz = 1;

        if (type == 1)
        {
            for (Number number : numbers)
            {
                proiz = proiz.floatValue() * Math.cos(Math.toRadians(number.floatValue()));
            }
        } else if (type == 2)
        {
            for (Number number : numbers)
            {
                proiz = proiz.floatValue() * Math.cos(number.floatValue());
            }
        }
        return proiz;
    }

    @Override
    public Number calculate(ArrayList<Number> numbers, int type, int accuracy)
    {
        Number proiz = calculate(numbers, type);
        return new BigDecimal(proiz.floatValue()).setScale(accuracy, RoundingMode.UP).doubleValue();
    }
}
