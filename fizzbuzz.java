using System;

namespace practice
{
    class Program
    {
        static void Main(string[] args)
        {
        Console.WriteLine("Input Parameters for FizzBuzz.");
        Console.Write("for fizz: ");
        int fizzVar = Convert.ToInt32(Console.ReadLine());
        
        Console.Write("for buzz: ");
        int buzzVar = Convert.ToInt32(Console.ReadLine());

        int x = 0;
        while(x <= 100)
        {
            if(x % fizzVar == 0 && x % buzzVar == 0) {
                Console.WriteLine("Fizzbuzz!");
            } else if(x % fizzVar == 0) {
                Console.WriteLine("Fizz!");
            } else if(x % buzzVar == 0) {
                Console.WriteLine("Buzz!");
            }

            if(x % fizzVar != 0 && x % buzzVar != 0) {
                Console.WriteLine(x);
            }
             x = x + 1;
        }
    }
}
