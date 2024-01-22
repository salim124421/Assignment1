import java.util.Scanner;

public class Complex {
    private double real;
    private double imaginary;

    // Default constructor with default values
    public Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    // Constructor with given values
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public static Complex add(Complex num1, Complex num2) {
        return new Complex(num1.real + num2.real, num1.imaginary + num2.imaginary);
    }

    // Method to add three complex numbers
    public static Complex add(Complex num1, Complex num2, Complex num3) {
        return add(add(num1, num2), num3);
    }

    // Method to multiply two complex numbers
    public static Complex multiply(Complex num1, Complex num2) {
        // (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
        double resultReal = num1.real * num2.real - num1.imaginary * num2.imaginary;
        double resultImaginary = num1.real * num2.imaginary + num1.imaginary * num2.real;
        return new Complex(resultReal, resultImaginary);
    }

    // Method to multiply three complex numbers
    public static Complex multiply(Complex num1, Complex num2, Complex num3) {
        return multiply(multiply(num1, num2), num3);
    }

    // Method to print the complex number and  also print odd even
    public void print() {
        
        System.out.println(real + " + " + imaginary + "i");
                if(imaginary==0 && real%2==0)
                System.out.println("Entered complex Number is Even");
                else if(imaginary==0 && real%2!=0)
                System.out.println("ntered complex Number is  Odd");
                
    }

    // Method to read a complex number from the user
    public static Complex readComplex() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter real part: ");
        double realPart = scanner.nextDouble();
        System.out.print("Enter imaginary part: ");
        double imaginaryPart = scanner.nextDouble();
        return new Complex(realPart, imaginaryPart);
    }

    // Additional utility methods
    public double absoluteValue() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public static void min(int a ,float b) {
        if(a<b)
       System.out.println("Min :  "+a);
       else
       System.out.println("max  :  "+b);
    }

    public static void max(int a,int b) {
       if(a>b)
       System.out.println("max  :  "+a);
       else
       System.out.println("max  :  "+b);
    }

    public static double avg(double... values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static double random() {
        return Math.random();
    }

    public static void main(String[] args) {
        // Example usage
        Complex complex1 = new Complex(2.0, 3.0);
        Complex complex2 = new Complex(1.0, -2.0);
        Complex complex3 = new Complex(-1.0, 1.0);

        Complex resultAdd2 = Complex.add(complex1, complex2);
        Complex resultAdd3 = Complex.add(complex1, complex2, complex3);

        Complex resultMultiply2 = Complex.multiply(complex1, complex2);
        Complex resultMultiply3 = Complex.multiply(complex1, complex2, complex3);

        System.out.println("Addition of complex numbers (2): ");
        resultAdd2.print();

        System.out.println("Addition of complex numbers (3): ");
        resultAdd3.print();

        System.out.println("Multiplication of complex numbers (2): ");
        resultMultiply2.print();

        System.out.println("Multiplication of complex numbers (3): ");
        resultMultiply3.print();

        System.out.println("Absolute value of complex number 1: " + complex1.absoluteValue());

       Complex.max(10, 7);
       Complex.min(3,7);
      // Scanner sc=new Scanner(System.in)
        System.out.println("Average value: " + Complex.avg(3, 7, 1, 5));

        int primeNumber = 11;
        System.out.println(primeNumber + " is prime: " + Complex.isPrime(primeNumber));

        int oddNumber = 7;
        System.out.println(oddNumber + " is odd: " + Complex.isOdd(oddNumber));

        int evenNumber = 4;
        System.out.println(evenNumber + " is even: " + Complex.isEven(evenNumber));

        System.out.println("Random number: " + Complex.random());

        // Reading a complex number from the user
        Complex userInput = Complex.readComplex();
        System.out.print("You entered: ");
        userInput.print();
    }
}
