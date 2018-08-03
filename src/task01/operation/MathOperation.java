package task01.operation;

import java.util.ArrayList;


public interface MathOperation
{
    Number calculate(ArrayList<Number> numbers);
    Number calculate(ArrayList<Number> numbers, int type);
    Number calculate(ArrayList<Number> numbers, int type, int accuracy);
}
