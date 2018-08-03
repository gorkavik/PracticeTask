package task01.operation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class RazSinusesMathOperation implements MathOperation
{
    @Override
    public Number calculate(ArrayList<Number> numbers)
    {
        return null;
    }

    @Override
    public Number calculate(ArrayList<Number> numbers, int type)
    {
        Number raz = numbers.get(0).floatValue();

        if (type == 1)
        {
            for (int i = 1; i < numbers.size(); i++)
            {
                raz = raz.floatValue() - Math.sin(Math.toRadians(numbers.get(i).floatValue()));
            }
        } else if (type == 2)
        {
            for (int i = 1; i < numbers.size(); i++)
            {
                raz = raz.floatValue() - Math.sin(numbers.get(i).floatValue());
            }
        }
        return raz;
    }

    @Override
    public Number calculate(ArrayList<Number> numbers, int type, int accuracy)
    {
        Number raz = calculate(numbers, type);
        return new BigDecimal(raz.floatValue()).setScale(accuracy, RoundingMode.UP).doubleValue();
    }
}
