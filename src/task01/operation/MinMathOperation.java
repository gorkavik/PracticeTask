package task01.operation;

import java.util.ArrayList;

public class MinMathOperation implements MathOperation
    {
        @Override
        public Number calculate(ArrayList<Number> numbers)
        {
            Number min = 1;
            for (Number i : numbers)
            {
                if (i.floatValue() < min.floatValue())
                {
                    min = i;
                }
            }
            return min;
        }
    }
