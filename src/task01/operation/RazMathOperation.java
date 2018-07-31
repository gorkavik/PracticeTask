package task01.operation;

import java.util.ArrayList;

public class RazMathOperation implements MathOperation
{

    @Override
    public Number calculate(ArrayList<Number> numbers)
    {
        Number raz = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++)
        {
            raz = raz.floatValue() - numbers.get(i).floatValue();
        }
        return raz;
    }

    @Override
    public String toString()
    {
        return "raznica";
    }
}
