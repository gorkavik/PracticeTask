package task01.operation;

import java.util.ArrayList;

public class SrznachMathOperation implements MathOperation
{
    private final SumMathOperation sumMathOperation;

    public SrznachMathOperation(SumMathOperation sumMathOperation)
    {
        this.sumMathOperation = sumMathOperation;
    }

    @Override
    public Number calculate(ArrayList<Number> numbers)
    {
        return sumMathOperation.calculate(numbers).floatValue() / numbers.size();
    }

    @Override
    public String toString()
    {
        return "Srednee";
    }
}
