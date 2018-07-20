package task02;

import task01.MyException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task2
{
    public static void main(String[] args) throws Exception
    {
        int c = 5;// amount of numbers for math operation
        System.out.println("Выберите единицы измерения угла:");
        System.out.println("1) Градусы");
        System.out.println("2) Радианы");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        int ed = Integer.parseInt(str);
        System.out.println("Выберите способ ввода:");
        System.out.println("1) Вручную");
        System.out.println("2) Произвольный выбор");
        str = reader.readLine();
        int sp = Integer.parseInt(str);
        switch (sp)
        {
            case 1:
            {
                System.out.println("Введите " + c + " значений углов через пробел:");
                str = reader.readLine();
                System.out.println("Выбраны значения: " + str);
                break;
            }
            case 2:
            {
                if (ed == 1)
                {
                    str = "";
                    double j;
                    for (int i = 0; i < c; i++)
                    {
                        j = Math.random() * 361;
                        str = str + Double.toString(j) + " ";
                    }
                } else if (ed == 2)
                {
                    str = "";
                    double j;
                    for (int i = 0; i < c; i++)
                    {
                        j = Math.random() * 6.28318530717958647;
                        str = str + Double.toString(j) + " ";
                    }


                }
                System.out.println("Выбраны значения: " + str);
                break;
            }
        }

        double[] ang = getDoubleAngles(str, c);

        System.out.println("Сумма синусов = " + getSumSinuses(ang, ed, 5));
        System.out.println("Сумма косинусов = " + getSumCosinuses(ang, ed));
        System.out.println("Разность синусов = " + getRazSinuses(ang, ed));
        System.out.println("Разность косинусов = " + getRazCosinuses(ang, ed, 3));
        System.out.println("Произведение синусов = " + getProizSinuses(ang, ed));
        System.out.println("Произведение косинусов = " + getProizCosinuses(ang, ed));

    }


    /**
     * @param string – строка значений углов;
     * @param count  -количество элементовж
     * @return строку значений значений углов в формате double;
     */
    private static double[] getDoubleAngles(String string, int count) throws MyException
    {
        double[] angles = new double[count];

        int j = 0;
        String s = "";
        for (int i = 0; i < string.length(); i++)
        {
            if (Character.isDigit(string.charAt(i)) | string.charAt(i) == '.' | string.charAt(i) == ' ')
            {
                s = s + string.charAt(i);
                if (string.charAt(i) == ' ' | i == (string.length() - 1))
                {
                    angles[j] = Double.parseDouble(s);
                    s = "";
                    j++;
                }
            } else throw new MyException("Введено не число", string.charAt(i));
        }
        return angles;
    }

    /**
     * @param angles – массив значений углов;
     * @param type   -единица измерения, имеющее значение од-
     *               ной из констант
     * @return сумму синусов значений углов;
     */
    private static double getSumSinuses(double[] angles, int type)
    {
        double sum = 0;
        if (type == 1)
        {
            for (double angle : angles)
            {
                sum = sum + Math.sin(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                sum = sum + Math.sin(angle);
            }
        }
        return sum;
    }


    /**
     * @param angles – массив значений углов;
     * @param type   -единица измерения, имеющее значение од-
     *               ной из констант
     * @return сумму косинусов значений углов;
     */
    private static double getSumCosinuses(double[] angles, int type)
    {
        double sum = 0;
        if (type == 1)
        {
            for (double angle : angles)
            {
                sum = sum + Math.cos(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                sum = sum + Math.cos(angle);
            }
        }
        return sum;
    }

    /**
     * @param angles – массив значений углов;
     * @param type   -единица измерения, имеющее значение од-
     *               ной из констант
     * @return разность синусов значений углов;
     */
    private static double getRazSinuses(double[] angles, int type)
    {
        double raz = 0;
        if (type == 1)
        {
            for (double angle : angles)
            {
                raz = raz - Math.sin(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                raz = raz - Math.sin(angle);
            }
        }
        return raz;
    }


    /**
     * @param angles – массив значений углов;
     * @param type   -единица измерения, имеющее значение од-
     *               ной из констант
     * @return разность косинусов значений углов;
     */
    private static double getRazCosinuses(double[] angles, int type)
    {
        double raz = 0;
        if (type == 1)
        {
            for (double angle : angles)
            {
                raz = raz - Math.cos(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                raz = raz - Math.cos(angle);
            }
        }
        return raz;
    }

    /**
     * @param angles – массив значений углов;
     * @param type   -единица измерения, имеющее значение од-
     *               ной из констант
     * @return произведение синусов значений углов;
     */
    private static double getProizSinuses(double[] angles, int type)
    {
        double proiz = 1;
        if (type == 1)
        {
            for (double angle : angles)
            {
                proiz = proiz * Math.sin(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                proiz = proiz * Math.sin(angle);
            }
        }
        return proiz;
    }


    /**
     * @param angles – массив значений углов;
     * @param type   -единица измерения, имеющее значение од-
     *               ной из констант
     * @return произведение косинусов значений углов;
     */
    private static double getProizCosinuses(double[] angles, int type)
    {
        double proiz = 1;
        if (type == 1)
        {
            for (double angle : angles)
            {
                proiz = proiz * Math.cos(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                proiz = proiz * Math.cos(angle);
            }
        }
        return proiz;
    }


    // перегруженные методы

    /**
     * @param angles – массив значений углов;
     * @param type   -единица измерения, имеющее значение од-
     *               ной из констант
     * @return сумму синусов значений углов;
     */
    private static double getSumSinuses(double[] angles, int type, int count)
    {
        double sum = 0;
        if (type == 1)
        {
            for (double angle : angles)
            {
                sum = sum + Math.sin(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                sum = sum + Math.sin(angle);
            }
        }

        double newsum = new BigDecimal(sum).setScale(count, RoundingMode.UP).doubleValue();
        return newsum;
    }


    /**
     * @param angles – массив значений углов;
     * @param type   -единица измерения, имеющее значение од-
     *               ной из констант
     * @return сумму косинусов значений углов;
     */
    private static double getSumCosinuses(double[] angles, int type, int count)
    {
        double sum = 0;
        if (type == 1)
        {
            for (double angle : angles)
            {
                sum = sum + Math.cos(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                sum = sum + Math.cos(angle);
            }
        }
        return sum;
    }

    /**
     * @param angles – массив значений углов;
     * @param type   -единица измерения, имеющее значение од-
     *               ной из констант
     * @return разность синусов значений углов;
     */
    private static double getRazSinuses(double[] angles, int type, int count)
    {
        double raz = 0;
        if (type == 1)
        {
            for (double angle : angles)
            {
                raz = raz - Math.sin(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                raz = raz - Math.sin(angle);
            }
        }
        return raz;
    }


    /**
     * @param angles – массив значений углов;
     * @param type   -единица измерения, имеющее значение од-
     *               ной из констант
     * @return разность косинусов значений углов;
     */
    private static double getRazCosinuses(double[] angles, int type, int count)
    {
        double raz = 0;
        if (type == 1)
        {
            for (double angle : angles)
            {
                raz = raz - Math.cos(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                raz = raz - Math.cos(angle);
            }
        }
        return raz;
    }

    /**
     * @param angles – массив значений углов;
     * @param type   -единица измерения, имеющее значение од-
     *               ной из констант
     * @return произведение синусов значений углов;
     */
    private static double getProizSinuses(double[] angles, int type, int count)
    {
        double proiz = 1;
        if (type == 1)
        {
            for (double angle : angles)
            {
                proiz = proiz * Math.sin(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                proiz = proiz * Math.sin(angle);
            }
        }
        return proiz;
    }


    /**
     * @param angles – массив значений углов;
     * @param type   -единица измерения, имеющее значение од-
     *               ной из констант
     * @return произведение косинусов значений углов;
     */
    private static double getProizCosinuses(double[] angles, int type, int count)
    {
        double proiz = 1;
        if (type == 1)
        {
            for (double angle : angles)
            {
                proiz = proiz * Math.cos(Math.toRadians(angle));
            }
        } else if (type == 2)
        {
            for (double angle : angles)
            {
                proiz = proiz * Math.cos(angle);
            }
        }
        return proiz;
    }

}