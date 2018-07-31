import task01.operation.MathOperation;
import task01.operation.MaxMathOperation;
import task01.operation.MinMathOperation;
import task01.operation.ProizMathOperation;
import task01.operation.SrznachMathOperation;
import task01.operation.SumMathOperation;

import java.util.ArrayList;

public class MainClass
{
    public static void main(String[] args) throws Exception
    {
        SumMathOperation sumMathOperation = new SumMathOperation();

        ArrayList<MathOperation> mathOperations = new ArrayList<>();
        mathOperations.add(new MaxMathOperation());
        mathOperations.add(new ProizMathOperation());
        mathOperations.add(sumMathOperation);
        mathOperations.add(new SrznachMathOperation(sumMathOperation));

        new task01.Task1(mathOperations).run1();
        //new task02.Task2().run2();
    }
}
