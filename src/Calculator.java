public class Calculator
{
    static int a = 50;
    static int b = 25;
    static int answer;

    public static void main(String[] args)
    {
        add();
        substract();
        multiplication();
        division();
        modulus();
    }

    static void add() {
        answer = a + b;
        System.out.println("addition of " + a + " & " + b + " = "+answer);

    }

    static void substract()
    {
         answer = a - b;
        System.out.println("substraction of " + a + " & " + b + " = "+answer);

    }
    static void multiplication()
    {
        answer = (a*b);
        System.out.println("multiplication of " +a+ " & " +b+ " = "+answer);

    }

    static void division() {
        answer = (a / b);
        System.out.println("division of " + a + " & " + b + " = " + answer);


    }

    static void modulus()
    {
       answer = (a%b);
       System.out.println("Modulus of " +a+ " & " +b+ " = "+answer);

    }
}
























