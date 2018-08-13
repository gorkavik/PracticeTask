import task01.Task1;
import task01.operation.*;
import task01.printmenu.Menu;
import task02.Task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainClass
{
    public static void main(String[] args) throws Exception
    {
        final BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        SumMathOperation sumMathOperation = new SumMathOperation();
        Menu menu = new Menu();

        ArrayList<MathOperation> mathOperations = new ArrayList<>();
        mathOperations.add(new MaxMathOperation());
        mathOperations.add(new ProizMathOperation());
        mathOperations.add(sumMathOperation);
        mathOperations.add(new SrznachMathOperation(sumMathOperation));

        new Task1(mathOperations, menu).run1(read);
        //new Task2().run2(read);
    }
}
