using System;

class Ncr
{
    static int CalculateFactorial(int num)
    {
        int fact = 1;

        for (int i = 2; i <= num; i++)
        {
            fact = fact * i;
        }

        return fact;
    }

    static int CalculateNcr(int n, int r)
    {
        int ncr = 0;
        int fact1 = 0;
        int fact2 = 0;
        int fact3 = 0;

        fact1 = CalculateFactorial(n);
        fact2 = CalculateFactorial(r);
        fact3 = CalculateFactorial(n - r);

        ncr = fact1 / (fact2*fact3);

        return ncr;
    }
    static void Main(string[] args)
    {
        int ncr = 0;
        int n = 0;
        int r = 0;

        Console.Write("Enter the value of 'n': ");
        n = int.Parse(Console.ReadLine());

        Console.Write("Enter the value of 'r': ");
        r = int.Parse(Console.ReadLine());

        ncr = CalculateNcr(n, r);

        Console.WriteLine("Ncr: " + ncr);
    }
}
